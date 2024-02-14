import java.util.Scanner;

public class prod {

    public static int Prod(int n1, int n2){
        int prod = n1*n2;
        return prod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = Prod(a,b);
        System.out.println("Product = " + mul);

    }
}
