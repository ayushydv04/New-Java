import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array :- ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }


        // System.out.println("Printing array : ");
        // for(int i = 0; i<n; i++){
        //     System.out.print(arr[i]);
        //     System.out.print(", ");
        // }

        // System.out.print("The array you entered is: ");
        // for (int i = 0; i < n; i++) {
        //     // if (i > 0) {
        //     // }
        //     System.out.print(", ");
        //     System.out.print(arr[i]);
        // }

        // int ar = Arrays.toString(arr);
        // System.out.println(ar);

        System.out.println(Arrays.toString(arr));

    }
}
