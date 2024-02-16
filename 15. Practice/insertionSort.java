public class insertionSort {

    public static void InsertionSort(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            // Finding correct pos to insert
            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            // insertion
            arr[j+1] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        InsertionSort(arr);
        printArr(arr);

    }
}
