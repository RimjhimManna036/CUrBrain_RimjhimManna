
import java.util.Scanner;

public class Q10 {

    public static int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        boolean[] isPrime = new boolean[n];

        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p <= (n - 1) / p; p++) {
            if (isPrime[p]) {
                for (int j = p * p; j < n; j += p) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;

        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(countPrimes(n));

        sc.close();
    }
}
