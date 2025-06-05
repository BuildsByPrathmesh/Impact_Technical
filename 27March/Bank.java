import java.util.Scanner;


class BankAccount {
    double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    final double Min_balance = 1500;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= Min_balance) {
            balance -= amount;
            return true;
        }
        System.out.println("Minimum balance should be 1500");
        return false;
    }
}

class CheckingAccount extends BankAccount {
    final double limit = 10000;

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }


    public boolean withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= -limit) {
            balance -= amount;
            return true;
        }
        System.out.println("limit of withdrawal is 10,000 ");
        return false;
        
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = null;

        System.out.println("Select Account Type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Checking Account");
        int accType = sc.nextInt();

        System.out.print("Enter initial balance: ");
        double initialBalance = sc.nextDouble();

        if (accType == 1) {
            account = new SavingsAccount(initialBalance);
        } else if (accType == 2) {
            account = new CheckingAccount(initialBalance);
        } else {
            System.out.println("Invalid account type.");
            System.exit(0);
        }

        while (true) {
            System.out.println("\nMenu:\t");
            System.out.print("1. Deposit\t");
            System.out.print("2. Withdraw\t");
            System.out.print("3. Check Balance\t");
            System.out.print("4. Exit\n");
            System.out.println("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    System.out.println("Deposited successfully.");
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double wd = sc.nextDouble();
                    if (account.withdraw(wd)) {
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Withdrawal failed. Check balance or limits.");
                    }
                    break;
                case 3:
                    System.out.println("Current Balance: " + account.getBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using the bank system.");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        
    }
    
}
