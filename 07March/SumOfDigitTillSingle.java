import java.util.*;
public class SumOfDigitTillSingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int sum=n;
        while(sum>9){ 
            n=sum;
            sum=0;
            while(n!=0){
                int d=n%10;
                sum=sum+d;
                n=n/10;
            }
    }
        sc.close();
        System.out.println(sum);
    }
    
}
