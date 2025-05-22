import java.util.*;
public class CountOfAllPossibleSubstrings {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println((int)Math.pow(2,str.length())-1);
        sc.close();
        
    }
}
