import java.util.Arrays;
import java.util.Scanner; 
public class FindSmallestChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = s.charAt(i);
        }
        Arrays.sort(arr);
        int p = 97; // 'a'
        boolean found = false;
        for (int index = 0; index < len; index++) {
            if (index == 0 || arr[index] != arr[index - 1]) {
                if (arr[index] == p) {
                    p++;
                } else if (!found) {
                    System.out.println((char) p);
                    found = true;
                    break;
                }
            }
        }
        if (!found && p <= 122) { // If all characters from 'a' to last present
            System.out.println((char) p);
        }
        sc.close();
    }
}
