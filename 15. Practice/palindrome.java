public class palindrome {
    public static void main(String[] args) {
        int n = 153;
        int rev = 0;
        int num = n;

        while(n!=0){
            int ld = n%10;
            rev = (rev * 10) + ld;
            n/=10;
        }

        if(num == rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}


public class oneton {
    public static void main(String[] args) {
        int n = 6;
        for(int i = 1; i <= n; i++){
            System.out.print(i + " ");
        }
    }
}
