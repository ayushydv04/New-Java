public class binarySearch {

    public static int BinarySearch(int arr[], int key){
        int s = 0, e = arr.length-1;
        int mid = s + (e-s)/2;
        //comparision
        while(s<=e){   

            if(arr[mid] == key){
                return 1;
            }
            if(arr[mid] < key){ //right
                s = mid+1;
            }
            else{
                e = mid-1;
            }
            mid = s + (e-s)/2; 
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 22;
        int found = BinarySearch(arr, key);
        if(found == 1){
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");
        }
        // System.out.println("Index for key is :- " + BinarySearch(arr, key));
        // System.out.println("hello");
    }
}
