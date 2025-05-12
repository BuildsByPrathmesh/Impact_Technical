import java.util.*;
public class IsCubicSumExist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int count=0;
        for (int i = 0; i < n; i++) {
            int lb=1;
            int ub=(int)Math.cbrt(arr[i]);
            int temp=((int)Math.pow(lb,3)+(int)Math.pow(ub,3));
            // System.out.println(lb+" " +ub+" " +temp);
            System.out.println(+arr[i]+" " +lb+" " +ub+" " +temp);
            while(lb<ub || lb==ub){
                temp=((int)Math.pow(lb,3)+(int)Math.pow(ub,3));
                
                if (temp==arr[i]) {
                    System.out.println("       " +arr[i]+" " +lb+" " +ub+" " +temp);
                    count++;
                    break;
                }else{
                    if(temp>arr[i]){
                        ub--;
                    }else{
                        lb++;
                    }
                }
            }
        }
        System.out.println("count: "+count);
    }
    
}
