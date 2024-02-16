import java.util.*;
public class getLargest {

    public static int Largest(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {3, 6, 10, 4, 89, 90, 34, 100};
        System.out.println(Largest(arr));
    }
}
