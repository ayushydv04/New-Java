public class reverseOriginal {
    public static void main(String[] args) {
        int n = 178;
        int rev = 0;
        int ld;

        while(n!=0){
            ld = n%10;
            rev = (rev * 10) + ld;
            n/=10;
        }

        System.out.print(rev + " ");
    }
}
