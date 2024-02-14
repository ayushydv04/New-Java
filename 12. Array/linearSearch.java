public class linearSearch {

    public static int linearSearch(int arr[], int key){
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==key){
                return 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 20;
        // boolean found = false;

        // for(int i = 0; i<arr.length; i++){
        //     if(arr[i] == key){
        //         found = true;
        //         break;
        //     }
        // }

        // if(found==true){
        //     System.out.println("Key is Present");
        // }else{
        //     System.out.println("Key is not present");
        // }

        int found = linearSearch(arr, key);

        if(found == 1){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }

    }
}
