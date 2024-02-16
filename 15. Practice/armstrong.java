import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total num :- ");
        int tnum = sc.nextInt();
        System.out.print("Number :- ");
        int num = sc.nextInt();
        
        int dupNum = num;
        int sum = 0;
        int ld = 0;

        while(num!=0){
            ld = num%10;
            sum += Math.pow(ld, tnum);
            num/=10;
        }

        if(dupNum == sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not");
        }
    }
}
