import java.util.Scanner;

public class prodJava {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num 1:- ");
        int num1 = sc.nextInt();
        System.out.print("Enter num 2:- ");
        int num2 = sc.nextInt();

        int prod = num1 * num2;
        System.out.println("Product = " + prod);
        
    }
}
