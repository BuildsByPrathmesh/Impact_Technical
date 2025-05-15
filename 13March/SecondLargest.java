import java.util.*;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("No. Of elements in First Array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        } int p1=0,p2=0;
        for (int index = 1; index < n-1; index++) {
            if(arr[p1]<arr[index]){
                p2=p1;
                p1=index;
            }
            
        }System.out.println(arr[p2]);
    }
    
}
