import java.util.*;
public class BinarytoDecimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int base=1;
        int decimal=0;
        while (n!=0) {
            int d=n%10;
            decimal=decimal+d*base;
            base=base*2;
            n=n/10;
        }
        System.out.println(decimal);
        sc.close();
    }
    
}
