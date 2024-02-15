public class palindrome {
    public static void main(String[] args) {
        int n = 121;
        int number = n;

        int rev = 0;

        while(n!=0){
            int ld = n%10;
            rev = (rev*10) + ld;
            n/=10;
        }

        if (rev == number) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
        System.out.println(rev);
        System.out.println(number);

    }
}
