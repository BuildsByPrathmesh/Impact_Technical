import java.util.Scanner;

public class ArrayRotate {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Elements: ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the Number: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int rotation=sc.nextInt();
        
        for (int r = 0; r< rotation; r++) {
            int temp=arr[n-1];
            for (int index = 1; index < n; index++) {
                arr[n-index]=arr[n-1-index];  
            }arr[0]=temp;


        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    sc.close();
    }
}
