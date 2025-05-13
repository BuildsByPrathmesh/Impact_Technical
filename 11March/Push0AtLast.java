import java.util.*;
public class Push0AtLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Tests: ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Number: ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int c0=0,num=0;
            while (arr[i]!=0) {
                int d=arr[i]%10;
                arr[i]/=10;
                if (d==1) {
                    num=num*10+1;
                    
                }else{
                    c0++;
                }
                
            }
            
            System.out.println(num*(int)Math.pow(10,c0));
        }
    sc.close();
    }
    
}
