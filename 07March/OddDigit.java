import java.util.*;

public class OddDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  Number: ");
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int temp = i;
            int dc = 0;
            while (temp != 0) {
                temp = temp / 10;
                dc++;
            }
            if (dc % 2 == 1) {
                count++;
            }
        }
        System.out.println("Count of Odd digits: " + count);
        sc.close();
    }
    
}
