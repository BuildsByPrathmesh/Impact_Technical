// 19=(1+9)+(1*9)

import java.util.*;

public class SpecialNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int n = sc.nextInt();
        System.out.print("Enter the First Number: ");
        int m = sc.nextInt();

        if (n<10 ||  n>99 ||m<10 ||m>99 ){
            System.out.println("Invalid Input");
        }else{
            for (int i=n;i<=m;i++){
                int d1= i/10;
                int d2=i%10;
                if ((d1+d2)+(d1*d2)==i){
                    System.out.println(i);
                }
            }

        }
        sc.close();
    }
}