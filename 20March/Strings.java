import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s1="Sonu";
        String s2="Sonu";
        String s3=new String("Sonu");
        String s4=new String("Sonu");
        String s="Prathmesh";
        
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s4==s3);
        System.out.println(s.charAt(0));
        System.out.println(s.indexOf(s));
        System.out.println(s.length());
        System.out.println(s.contains(s));
        System.out.println(s.repeat(2));
        System.out.println(s.equals(s4));
        sc.close();
        
    }
    
}
