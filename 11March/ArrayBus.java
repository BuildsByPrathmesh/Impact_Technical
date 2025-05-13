import java.util.*;
public class ArrayBus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No. Of Groups:");
        int n=sc.nextInt();
        System.out.println("Enter the Max Cap of Buss:");
        int m=sc.nextInt();
        int arr[]=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            if (arr[i]>m) {
                System.out.println("Invalid Input");
                i--;
            }
        }
        int passengers=0;
        for (int i = 0; i < n; i++) {
            while (i!=n) {
                passengers=+arr[i];
            }
            System.out.println("Passenegers in "+ (i+1)+"Bus are "+passengers);
            passengers=0;

        }
    }
    

}
