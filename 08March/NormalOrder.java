import java.util.*;
public class NormalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int rev=0;
        while(n!=0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
       while (rev!=0) {
            int d=rev%10;
            System.out.println(d);
            rev=rev/10;
        
       }
        sc.close();
    }
    
}
