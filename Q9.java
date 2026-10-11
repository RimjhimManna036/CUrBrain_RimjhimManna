
import java.util.Scanner;

public class Q9 {

    static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }

        for (int i = 2; i <= x / i; i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }

    static int nextPrime(int n) {
        if (n < 2) {
            return 2;
        }

        int candidate = n + 1;

        while (true) {
            if (isPrime(candidate)) {
                return candidate;
            }
            candidate++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(nextPrime(n));

        sc.close();
    }
}
