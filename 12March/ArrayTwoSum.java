import java.util.*;
public class ArrayTwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No. Of elements in First Array:");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("No. Of elements in Second Array:");
        int m = sc.nextInt();
        int arr2[] = new int[m];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        int len1=n-1,len2=m-1;
        int c=0;
        while (len1 >= 0 || len2 >= 0 || c != 0) {
            int sum = c;
            if (len1 >= 0) {
                sum += arr1[len1];
            }if (len2 >= 0){
                 sum += arr2[len2];
                }
            System.out.print(sum % 10+ " ");
            c = sum / 10;
            len1--;
            len2--;
        }
        sc.close();
        
    }
}
