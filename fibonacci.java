public class fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 10;
        
        for(int i = 1; i<=8; i++){
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        



    }
}
