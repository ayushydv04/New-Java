public class prime {
    public static void main(String[] args) {
        int low = 10, high = 20;
        int i, j;
        for(i = low; i<=high; i++){
            for(j = 2; j<=i; j++){
                if(i%j == 0){
                    break;
                }

            }
            if(i == j){
                System.out.print(j + " ");
            }
        }
    }
}
