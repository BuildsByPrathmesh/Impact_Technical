import java.util.Scanner;

public class ValidPalindrone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String pali="";
        int c=0;
        // s = s.toLowerCase();
        for (int index = s.length()-1; index >-1 ; index--) {
            pali=pali+s.charAt(index);
        }
        for(int i=0;i< s.length()-1;i++){
            if (s.charAt(i)!=pali.charAt(i)) {

            }
        }
        System.out.println("palindrome");

        sc.close();

    }
    
    
}
