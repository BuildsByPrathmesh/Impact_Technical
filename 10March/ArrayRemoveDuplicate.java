import java.util.*;
public class ArrayRemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }



        
        for (int i = 0; i < n; i++) {
            int flag=0;
            for (int index = 0; index < i; index++) {
                if (arr[i]==arr[index]) {
                    flag=1;
                }
            }if (flag==0) {
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
    

    
}
