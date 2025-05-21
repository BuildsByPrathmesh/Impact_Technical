import java.util.*;
public class FrequencyOfaCharinString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        char c=sc.next().charAt(0);
        int count=0;

        for (int i=0;i<s.length();i++){
            if (c == s.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
        
    }
}
