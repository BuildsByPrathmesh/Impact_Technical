import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n=sc.nextInt();
        int a=n,b=n;
        int cd=0;
        while (n!=0) {
            cd++;
            n=n/10;
        }
        int sum=0;
        while(a!=0){
            int digit=a%10;
            sum=sum+(int)Math.pow(digit,cd);
            a=a/10;
        }
        if (b==sum) {
            System.out.println("Armstrong");
        }else{
            System.out.println("Not");
        }

        sc.close();
    }
    
}
