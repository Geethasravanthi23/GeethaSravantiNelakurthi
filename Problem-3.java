
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int limit = (n % 2 == 0) ? (n - 1) : n; // if even, reduce by 1
        for (int i = 1; i <= limit; i++) {
            System.out.print((2 * i - 1) + " ");
        }
    }
}
