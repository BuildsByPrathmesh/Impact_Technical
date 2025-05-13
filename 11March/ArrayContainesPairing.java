import java.util.*;
public class ArrayContainesPairing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No. Of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        sc.close();
        for (int index = 0; index < n/2; index++) {
            System.out.println(arr[n-1-index]+"  "+ arr[index]);
        }if (n%2==1) {
            System.out.println(arr[n/2+1]+"  0");
            
        }
        sc.close();
    }
}
