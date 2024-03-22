public class OopsBasics {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Ayush";
        // myAcc.password = "abcde"; can't access because it's private
        myAcc.setPassword("abcde");
        myAcc.showPassword();   // To see private data
    }
}

class BankAccount{
    public String username;
    private String password;

    void setPassword(String pwd){
        password = pwd;
    }

    void showPassword(){
        System.out.println(password);
    }
}

class Pen{
    String color = "red";
    int tip;
    
    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }

}
