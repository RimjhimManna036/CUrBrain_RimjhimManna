import java.util.Scanner;

public class Q6 {

    public static int frequencyDifference(int n, int a, int b) {

        if (n < 0 || a < 0 || a > 9 || b < 0 || b > 9) {
            return -1;
        }

        int countA = 0;
        int countB = 0;

        if (n == 0) {
            if (a == 0) {
                countA++;
            }
            if (b == 0) {
                countB++;
            }
        } else {
            while (n != 0) {

                int digit = n % 10;

                if (digit == a) {
                    countA++;
                }

                if (digit == b) {
                    countB++;
                }

                n = n / 10;
            }
        }

        return Math.abs(countA - countB);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input: n = ");
        int n = sc.nextInt();

        System.out.print("a = ");
        int a = sc.nextInt();

        System.out.print("b = ");
        int b = sc.nextInt();

        int result = frequencyDifference(n, a, b);

        if (result == -1) {
            System.out.println("Invalid input");
        } else {
            System.out.println("Difference = " + result);
        }

        sc.close();
    }
}