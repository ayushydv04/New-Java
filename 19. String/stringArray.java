import java.util.Arrays;
import java.util.Scanner;

public class stringArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] stringArr = new String[n];

        for(int i = 0; i<n; i++){
            stringArr[i] = sc.next();
        }

        // System.out.println(Arrays.toString(stringArr));

        for(String i : stringArr){
            System.out.print(i + " ");
        }

    }
}
