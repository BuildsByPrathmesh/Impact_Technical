
import java.util.*;

public class ArraySameorNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println("No. of Elements in Prince's Array: ");
        int m =sc.nextInt();
        System.out.println("No. of Elements in Cinderella's Array: ");
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        int sum1=0,sum2=0;
        for (int i = 0; i < n; i++) {
            arr1[i]=sc.nextInt();
            sum1=sum1+arr1[i];
        }
        for (int i = 0; i < m; i++) {
            arr2[i]=sc.nextInt();
            sum2=sum2+arr2[i];
        }
        if(n==m&&sum1==sum2){
            System.out.println("Same");
        }else{
            System.out.println("Not Same");
        }
        sc.close();
    }
    
}
