import java.util.Scanner;

public class searchingIn2Darray {
    public static void main(String[] args) {
        
        int arr[][] = new int[3][3];
    
        Scanner sc = new Scanner(System.in);
    
    
        // Taking input
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // Output 
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


}
