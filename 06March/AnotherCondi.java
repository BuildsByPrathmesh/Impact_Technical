import java.util.Scanner;

public class AnotherCondi {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a two-digit number: ");
        int n= sc.nextInt();

        if (n%2==1) {
            System.out.println("Weird");
        } else {
            if (n >1 && n<6) {
                System.out.println("Not Weird");
            } else if (n >5 && n<21) {
                    System.out.println("Weird");
            } else {
                if (n>20) {
                    System.err.println("Not Weird");
                    
                }
            }
        }
        sc.close();
    }
}
