import java.util.*;

public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n=sc.nextInt();
        int sq=n*n;
        System.out.println(sq);
        int divisor=1,temp=n;
        while (temp!=0) {
            divisor*=10;
            temp=temp/10;
        }
        System.out.println(divisor);


        int ln= sq/divisor;
        int rn = sq % divisor;
        System.out.println(rn);
        System.out.println(ln);
        if (ln+rn==n){
            System.out.println("Kaprekar Number");
        }else{
            System.out.println(" Not a Kaprekar Number");
        }



    }
    
}
