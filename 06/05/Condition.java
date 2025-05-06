/*WAP to take input of 2 digit no and 
if no is less than 20 print less than 20, 
if it is greater check its odd or even, 
if not 2 digit than invalid input*/

import java.util.Scanner;
public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a two-digit number: ");
        int num = sc.nextInt();

        if (num < 10 || num > 99) {
            System.out.println("Invalid input. Please enter a two-digit number.");
        } else if (num < 20) {
            System.out.println("The number is less than 20.");
        } else {
            if (num % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
        }

        sc.close();
    }
}