import java.util.*;

public class AdamNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int numSq=n*n;
        System.out.println(numSq);
        int rev=0;
        while(n!=0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        System.out.println(rev);
        int revSq=rev*rev;
        System.out.println(revSq);
        int temp=revSq;
        int revofRevSq=0;
        while(temp!=0){
            int d=temp%10;
            revofRevSq=revofRevSq*10+d;
            temp=temp/10;
        }
        System.out.println(revofRevSq);
        if (numSq==revofRevSq){
            System.out.println("Adam Number");
            
        }else{
            System.out.println("Not Adam");
        }
        sc.close();
    }
    

    
}


