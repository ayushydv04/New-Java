import java.util.Scanner;

public class cpy3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        // char[] charArr = username.toCharArray();
        // System.out.println(charArr[0]);
        // System.out.println(Arrays.toString(charArr));

        boolean specialChar = false;
        boolean numericVal = false;
        for(int i = 0; i < username.length(); i++){
            if(username.charAt(i) == '@'){
                specialChar = true;
            }

            if (username.charAt(0) == '1'){
                numericVal = true;
            }
                
        }

        if(specialChar){
            System.out.println("It has special character");
        }
        else if (numericVal){
            System.out.println("It has numeric value");
        }
        else if (username.length() < 5){
            System.out.println("Length is less than length");
        }
        else{
            System.out.println(username + " is correct");
        }
    }
}
