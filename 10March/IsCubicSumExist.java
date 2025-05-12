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
            // System.out.println(lb+" " +ub+" " +temp);
            // System.out.println(+arr[i]+" " +lb+" " +ub+" " +temp);
            while(lb<=ub){
                int temp=((int)Math.pow(lb,3)+(int)Math.pow(ub,3));
                
                if (temp==arr[i]) {
                    System.out.print(arr[i]+" ");
                    // System.out.println("When " +arr[i]+"" +lb+" " +ub+" " +temp);
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
        System.out.println("are Good Numbers");
        System.out.println("count: "+count);
        sc.close();
    }
    
}
