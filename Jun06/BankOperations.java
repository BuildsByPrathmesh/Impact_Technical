/*
Bank Chat Bot
A chatbot application for a fintech company processes customer queries and responses. The chatbot takes human sentences which translate into simple operations like show balance and depositing or withdrawing money. Implement functions to take these sentences and make the process automatic.

The initial balance is 0. Perform the correct action when a keyword is encountered.

Map keywords to actions
Action Keywords
Show balance “see”, “show”
Deposit funds “deposit”, “put”, “invest”, “transfer”
Withdraw funds “withdraw”, “pull”

Note that if the action is deposit or withdraw funds, the user request word is followed by the amount. After each request is processed, the chatbot responds with the balance. If there is an insufficient balance, a withdrawal request is canceled and the balance remains unchanged.

It is guaranteed that every sentence given by a customer is valid as defined above.

BankOperations class:

Implement the IBankAccountOperation interface.
The following methods will be used to create output:
Deposit method takes as a parameter decimal d and adds it to the accounts.
Withdraw method takes as a parameter decimal d and subtracts it from the accounts.
ProcessOperation method takes as a parameter the string message and returns the balance.

Example:

Commands Output
I want to see my balance
0
I want to see money in my account
0
I want to withdraw 200
0
I want to pull 100
0
I want to deposit 500
500
I want to invest 600
1100
I want to transfer 100 to my account
1200
I want to deposit 500 dollars
1700
Pull 100 dollars
1600
Deposit 200
1800
The initial balance is 0, and no withdrawals are honored unless there is a sufficient balance.

Function Description

Create the BankOperations class and implement functions according to the IBankAccountOperation interface to process messages.


Sample Input

STDIN FUNCTION
----- --------
5 number of requests = 5
Deposit 2396
I want to transfer 3017 dollars to my account
I want to pull 2300 dollars
I want to deposit 3980 dollars
I want to transfer 2811 dollars to my account

Sample Output

2396
5413
3113
7093
9904
Explanation

Initial balance is 0

Deposit 2396, balance 2396

Deposit 3017, balance 5413

Withdraw 2300, balance 3113

Deposit 3980, balance 7093

Deposit 2811, balance 9904 */



import java.util.*;
public class BankOperations{
    private double balance;

    public BankOperations() {
        this.balance = 0;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
        // If balance is insufficient, no action is taken.
    }
    public double processOperation(String message) {
        String[] words = message.toLowerCase().split(" ");

        // Check for show balance keywords
        if (containsAny(words, "see", "show")) {
            return balance;
        }

        // Check for deposit keywords
        if (containsAny(words, "deposit", "put", "invest", "transfer")) {
            double amount = extractAmount(words);
            deposit(amount);
            return balance;
        }

        // Check for withdraw keywords
        if (containsAny(words, "withdraw", "pull")) {
            double amount = extractAmount(words);
            withdraw(amount);
            return balance;
        }

        // Return current balance if no valid action is detected
        return balance;
    }

    private boolean containsAny(String[] words, String... keywords) {
        for (String word : words) {
            for (String keyword : keywords) {
                if (word.equals(keyword)) {
                    return true;
                }
            }
        }
        return false;
    }

    private double extractAmount(String[] words) {
        for (String word : words) {
            try {
                return Double.parseDouble(word);
            } catch (NumberFormatException ignored) {
                // Continue if the word is not a valid number
            }
        }
        return 0; // Default amount if no valid number is found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        BankOperations bank = new BankOperations();

        for (int i = 0; i < n; i++) {
            String message = scanner.nextLine();
            double balance = bank.processOperation(message);
            System.out.println((int) balance); // Print balance as an integer
        }
    }
}