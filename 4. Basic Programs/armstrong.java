import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Value :- ");
        int r = sc.nextInt();
        System.out.print("Enter Number to be checked :- ");
        int n = sc.nextInt(); 
        int result = 0, rem;
        int orgNum = n;

        while(n!=0){
            rem = n%10;
            result += Math.pow(rem, r); 
            n /= 10;
        }

        if(orgNum == result){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}
