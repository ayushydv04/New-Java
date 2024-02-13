public class reverseNumber {
    public static void main(String[] args) {
        int n = 10899;
        int rev = 0;

        while(n!=0){
            rev = n%10;
            n=n/10;
            System.out.print(rev);
        }

    }
}


/*
 * 1) To get last digit --> num%10
 * 2) To remove last Digit --> num/10
 */