public class ReverseOriginal {
    public static void main(String[] args) {
        // Going to reverse original number 
        // we'll save reverse in some other variable
        // Formula used --> rev = (rev * 10) + lastDigit
        
        int n = 10899;
        int rev = 0;
        
        while(n!=0){
            int ld = n%10;
            rev = (rev * 10) + ld;
            n/=10;
        }
        System.out.println(rev);



    }
}
