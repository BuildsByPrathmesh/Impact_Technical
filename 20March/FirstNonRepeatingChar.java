import java.util.*;
public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String before = str.substring(0, i);
            String after = str.substring(i + 1);
            if (before.indexOf(c) == -1 && after.indexOf(c) == -1) {
                System.out.println(c);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No Such Char");
        }
        sc.close();
    }
}