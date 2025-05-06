
// Wap to reverse a 3 digit number
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three digit number: ");
        int num = sc.nextInt();
        
        // Extracting the digits
        int firstDigit = num / 100; 
        int secondDigit = (num / 10) % 10; 
        int lastDigit = num % 10;
        
        // Reversing the number
        int reversedNum = (lastDigit * 100) + (secondDigit * 10) + firstDigit;
        
        System.out.println("The reversed number is: " + reversedNum);
        sc.close();
    }
}