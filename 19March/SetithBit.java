import java.util.*;
public class SetithBit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int binaryNum=sc.nextInt(),i=sc.nextInt();
        int num=1<<i;
        System.out.println(num);
        System.out.println(binaryNum|num);
        sc.close();
    }
}
