
public class SwapUsingXOR {
    public static void main(String[] args) {
        int a=1011,b=1101;
        a=a^b;
        b=b^a;
        a=a^b;
        System.out.println(a+" "+b);
    }
}
