
public class StairCaseOfStars {
    public static void main(String[] args) {
        int n=4;
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("o");
            }
            System.out.println();
        }
    
}
}