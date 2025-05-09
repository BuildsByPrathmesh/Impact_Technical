import java.util.*;
public class TrendyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int num = sc.nextInt();

        if (num < 100 || num > 999) {
            System.out.println("Invalid Input");
        }
        else{
            int secondDigit = (num / 10) % 10;
            if (secondDigit%3==0) {
                System.out.println("Trendy Number");
            }else{
                System.out.println("Not a Trendy Number.");
            }
        }
        sc.close();
    }
}
