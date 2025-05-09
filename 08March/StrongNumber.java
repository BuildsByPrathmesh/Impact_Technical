import java.util.*;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n=sc.nextInt();
        int sum=0;
        while(n!=0){
            int digit=n%10;
            int product=1;
            while (digit!=1) {
                product=product*digit;
                digit--;
            }
            n=n/10;
            sum=sum+product;
        }
        System.out.println(sum);
        sc.close();
    }
}
