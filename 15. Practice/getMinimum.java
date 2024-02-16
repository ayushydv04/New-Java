import java.util.*;
public class getMinimum {

    public static int MinElement(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = {3, 6, 10, 4, 89, 1, 90, -3, 34, 100};
        System.out.println(MinElement(arr));
    }
}
