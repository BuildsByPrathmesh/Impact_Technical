
import java.util.*;

public class ArrayCompatible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("No. of Elements in First Array: ");
        int n =sc.nextInt();
        System.out.println("No. of Elements in Second Array: ");
        int m =sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        int count=0;
        for (int i = 0; i < n; i++) {
            arr1[i]=sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            arr2[i]=sc.nextInt();
           
        }
        
        if(n==m){
            for (int i = 0; i < n; i++) {
                if (arr1[i]>=arr2[i] ) {
                    count++;
                   
                }
            }
            System.out.println(count);
            if(count==n){
                System.out.println("Compatible");
            }else{
            System.out.println("Not Compatible");
        }
        }else{
            System.out.println("Not Compatible");
        }
        sc.close();
    }
    
}
