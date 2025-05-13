import java.util.*;
public class ArrayOddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No. Of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int p1 = 0, p2 = n - 1;

        while (p1 < p2) { // Ensure p1 and p2 do not cross each other
            if (arr[p1] % 2 == 1 && arr[p2] % 2 == 0) { // Odd at p1 and even at p2
                int temp = arr[p1];
                arr[p1] = arr[p2];
                arr[p2] = temp;
                p1++;
                p2--;
            } else {
                if (arr[p1] % 2 == 0) { // If p1 points to an even number, move forward
                    p1++;
                }
                if (arr[p2] % 2 == 1) { // If p2 points to an odd number, move backward
                    p2--;
                }
            }
        }

        System.out.println("Array after rearranging odd and even elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}