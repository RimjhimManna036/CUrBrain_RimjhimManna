import java.util.Scanner;

public class Q7 {

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid array size!");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter positive integers:");

        for (int i = 0; i < n; i++) {
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Enter integers only.");
                sc.close();
                return;
            }

            arr[i] = sc.nextInt();

            if (arr[i] <= 0) {
                System.out.println(
                    "Invalid input! Zero and negative numbers are not allowed."
                );
                sc.close();
                return;
            }
        }

        int result = arr[0];

        for (int i = 1; i < n; i++) {
            result = gcd(result, arr[i]);
        }

        System.out.println("GCD of the array: " + result);

        sc.close();
    }
}
