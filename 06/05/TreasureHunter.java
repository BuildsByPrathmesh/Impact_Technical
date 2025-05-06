import java.util.Scanner;
public class TreasureHunter {
    public static void main(String[] args) {   
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Gold coins: ");
        int gold = sc.nextInt();
        System.out.print("Enter Ben's share: ");
        int lb = sc.nextInt();
        System.out.print("Enter BLackBeard's share: ");
        int bb = sc.nextInt();

        int lbs, bbs; // Ben's and BlackBeard's share in gold coins

        lbs= (gold * lb) / 100; // Ben's share in gold coins
        bbs= ((gold-lbs) * bb) / 100; // BlackBeard's share in gold coins
        int remaining = gold - lbs - bbs; // Remaining gold coins after Ben and BlackBeard's share

        System.out.println( lbs);
        System.out.println( bbs);
        System.out.println((remaining/3));

        sc.close();
     }

}

