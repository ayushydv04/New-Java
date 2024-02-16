public class fibbonaci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int next;
        int n = 8;

        for(int i = 1; i<=n; i++){
            System.out.print(a + " ");
            next = a + b;
            a = b;
            b = next;
        }
    }
}
