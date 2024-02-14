public class factorial {

    public static int fact(int n){
        int f = 1;
        for(int i = 1; i<=n; i++){
            f = f*i;
        }
        return f;
    }

    public static void main(String[] args) {
        int n = 3;
        int fac = fact(3);
        System.out.println("Factorial = " + fac);
    }
}
