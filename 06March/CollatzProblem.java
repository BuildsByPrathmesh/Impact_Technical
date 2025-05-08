import java.util.*;
public class CollatzProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int flag=0;
        while(n!=1){
            System.err.println(n);
            flag++;
            if (n%2==0) {
                n=n/2;
            }else{
                n=3*n+1;
            }
        }
        System.err.println(n);
        System.err.println(flag);
        sc.close();
    }   
}
