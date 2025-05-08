import java.util.*;
public class NearestInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        System.out.print("Enter the m: ");
        int m = sc.nextInt();
        if (num%m==0) {
            System.out.println(num);            
        }else{
            if (num%m<(m/2)){
                System.out.println(num-num%m);
            }else{
                System.out.println(num+(m-num%m));
            }
        }
        sc.close();
    
    }
    
}
