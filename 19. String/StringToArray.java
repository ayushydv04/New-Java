import java.util.Arrays;

public class StringToArray {
    public static void main(String[] args) {
        String b = "Uday is a good boy";

        String[] strArr = b.split(" ");

        System.out.println(Arrays.toString(strArr));
    }
}
