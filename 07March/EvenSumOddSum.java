import java.util.*;

public class EvenSumOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
       int  SumEven=0,SumOdd=0;
        while (n!=0){
            int r=n%10;
            if(r%2==0){
                SumEven+=r;
            }else{
                SumOdd+=r;
            }
            n=n/10;
        }
        System.out.println("Sum of Even Digits is"+SumEven);
        System.out.println("Sum of Odd Digits is:"+SumOdd);
        sc.close();
    }
    
}
