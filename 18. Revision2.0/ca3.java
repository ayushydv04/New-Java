import java.util.*;

public class ca3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = sc.next();
        // String us = "user@";

        if(username.matches(".*[@!#$%^&*].*")){
            System.out.println("Username not allowed coz contains special characters");
        } 
        else if (Character.isDigit(username.charAt(0))){
            System.out.println("user name can't start with numberical value");
        }

    }
}
