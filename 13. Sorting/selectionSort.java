// Selection sort mei hm pehle first element ko min maan lete h aur fir pure array m check krte h agr usse bhi koi chota element milta h toh hm fir usko min bna dete h aur fir i ko min se swap kr dete h

public class selectionSort {

    public static void SelectionSort(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            int min = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            // Swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        SelectionSort(arr);
        printArr(arr);
    }
}
