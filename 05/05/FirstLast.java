// wap to add first and last digit of a four digit number

import java.util.Scanner;

public class FirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a four digit number: ");
        int num = sc.nextInt();
        
        // Extracting the first and last digits
        int firstDigit = num / 1000; // First digit
        int lastDigit = num % 10;    // Last digit
        
        // Calculating the sum of first and last digits
        int sum = firstDigit + lastDigit;
        
        System.out.println("The sum of the first and last digit is: " + sum);
        sc.close();
    }
}

