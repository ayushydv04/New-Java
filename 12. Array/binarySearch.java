public class binarySearch {

    public static int binarySearch(int number[], int key){
        int s = 0, e = number.length-1;
        int mid = (s +e)/2;
        //comparision
        while(s<=e){

            if(number[mid] == key){
                return mid;
            }
            if(number[mid] > key){ //right
                s = mid+1;
            }
            else{
                e = mid-1;
            }
            // mid = s + (e-s)/2;
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 9;

        System.out.println("Index for key is :- " + binarySearch(arr, key));
    }
}
