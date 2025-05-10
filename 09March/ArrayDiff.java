import java.util.*;

public class ArrayDiff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int dif=arr[0];
        for (int i = 1; i < n; i++) {
            dif=dif-arr[i];
        }
        System.out.println(dif);
        sc.close();
    }
    

    
}


