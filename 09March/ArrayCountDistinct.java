


import java.util.*;

public class ArrayCountDistinct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];

        int count=n;
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();  
            for (int j = 0; j < i; j++) {
                if(arr[i]==arr[j]){
                    count=count-1;
                    break;

                }
                
            }
        }
        System.out.println(count);
        sc.close();
    }
    
}
