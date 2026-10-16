import java.util.Scanner;

public class Q11 {

    static final long MOD = 1000000007;

    static long modularAddition(int n, Scanner sc) {
        long sum = 0; 

        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();

            sum = (sum + num) % MOD;
        }

        return sum; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the array elements:");
        long result = modularAddition(n, sc);

        System.out.println("Modular sum = " + result);

        sc.close();
    }
}
