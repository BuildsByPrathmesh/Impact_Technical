import java.util.*;
public class ArrayHeightWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No. Of Individuals:");
        int n = sc.nextInt();

        int arr[] = new int[2 * n];

        System.out.println("Enter the height and weight of each individual:");
        for (int i = 0; i < n * 2; i++) {
            arr[i] = sc.nextInt();
        }

        int maxHeightIndex = 0, maxWeightIndex = 1;

        for (int index = 0; index < 2 * n; index++) {
            if (index % 2 == 0) {                             // Height
                if (arr[index] > arr[maxHeightIndex]) {
                    maxHeightIndex = index;
                }
            } else {                                        // Weight
                if (arr[index] > arr[maxWeightIndex]) {
                    maxWeightIndex = index;
                }
            }
        }

       
        int maxHeightPerson = maxHeightIndex / 2 + 1;
        int maxWeightPerson = maxWeightIndex / 2 + 1;


        String result = maxHeightPerson + " " + maxWeightPerson;
        System.out.println(result);

        sc.close();
    }
}