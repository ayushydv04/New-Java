import java.util.Scanner;

public class typeConv {
    public static void main(String[] args) {
        // int a = 25;
        // long b = a;
        //No error runs perfectely

        // but

        // long a = 25;
        // int b = a;
        //Throws error because long size is greater than int

        /*
         * 
         * Conversion happens when
         * a) type compatible
         * b) destination type > source type
         * 
         */

         /*
          * byte --> short --> int --> float --> long --> double

            if we do vice versa then data can be leaked
          */

        // Scanner sc = new Scanner(System.in);
        // int number = sc.nextFloat();
        // System.out.println(number);

        //Throws error because float can't be assigned to integer 
        // but viseversa is possible


    }
}
