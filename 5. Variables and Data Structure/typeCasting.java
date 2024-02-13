public class typeCasting {
    public static void main(String[] args) {
        // float a = 25.12f;
        // int b = (int)a;  //This line converts to int and ignores lossy conversion
        // System.out.println(b); //removes all decimal places when converted to int

        // float marks = 99.999f;
        // int marks2 = (int) marks;
        // System.out.println(marks2);

        char ch = 'a';
        char chb = 'b';
        int number = ch;  //gives ascii value of 'a'
        int number2 = chb;  //gives ascii value of 'a'
        System.out.println(number);
        System.out.println(number2);
    }
}
