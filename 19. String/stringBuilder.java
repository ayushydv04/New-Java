
public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");

        // charAt index 0
        System.out.println(sb.charAt(0));

        // Set character at index   
        // This replaces the character
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // If we want to insert any character at any index 
        sb.insert(0, 'G');
        System.out.println(sb);

        // delete a part of substring
        sb.delete(0, 1);
        System.out.println(sb);

        // Appending after string
        sb.append("Stark");
        System.out.println(sb);
    }

}
