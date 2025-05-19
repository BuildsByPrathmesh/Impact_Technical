import java.util.*;
public class ClearTheIthBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int index=sc.nextInt();

        int a=1<<index;
        num=num&(~a);
        System.out.println(num);
        sc.close();
    }
    
}
