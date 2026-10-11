import java.util.Scanner;

public class Q7 {

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findArrayGCD(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("The array must contain at least one element.");
        }
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            result = gcd(result, arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The array must contain at least one positive integer.");
            scanner.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " positive integers (separated by spaces): ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();
        
        int result = findArrayGCD(arr);
        System.out.println("GCD of the array: " + result);
    }
}