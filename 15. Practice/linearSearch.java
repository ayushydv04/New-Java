public class linearSearch {

    public static int LinearSearch(int arr[], int key){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == key){
                return 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {3, 6, 10, 4, 89, 90, 34};
        int key = 89;

        LinearSearch(arr, key);

        if(LinearSearch(arr, key) == 1){
            System.out.println("Key is found " + key);
        }else{
            System.out.println("Key not present " + key);
        }

    }
}
