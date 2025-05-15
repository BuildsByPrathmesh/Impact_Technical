import java.util.Scanner;

public class DecimaltoBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int res = 0, place = 1;
        if (n == 0) {
            System.out.print(0);
        } else {
            while (n != 0) {
                int rem = n % 2;
                res = res + rem * place;
                place = place * 10;
                n = n / 2;
            }
            System.out.print(res);
        }
    sc.close();
    }
}