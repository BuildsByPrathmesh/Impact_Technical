import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int binaryNum=sc.nextInt();
        if ((binaryNum ^ 1) == 1) {
            System.out.println((binaryNum ^ 1));
            System.out.println("Odd");
        } else {
            System.out.println((binaryNum ^ 1));
            System.out.println("Even");
        }
        sc.close();
    }
    
}
