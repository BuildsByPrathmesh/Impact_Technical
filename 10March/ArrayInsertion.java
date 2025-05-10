
import java.util.*;

public class ArrayInsertion{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int position=sc.nextInt();
        int ele=sc.nextInt();
        System.out.println("The New Array elements are:");
        for (int i = 0; i < n; i++) {
            if (i+1==position) {
                System.out.println(ele+" added");
            }
            System.out.println(arr[i]);
            
        }
        sc.close();
    }
    

    
}


