import java.util.Arrays;
import java.util.Scanner;

public class ArrayMissingElement {
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
        int num=1;
        for (int index = 0; index < n; index++) {
            if (arr[index]>0) {
                if(arr[index]==num){
                    num++;
                }else{
                    break;
                }
            }  
        }
        System.out.println(num);
        sc.close();
    }  
}
