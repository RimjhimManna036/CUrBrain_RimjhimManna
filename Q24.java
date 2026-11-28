
import java.util.Scanner;

public class Q24 {

    public static int shortestSubarray(int[] arr, int target) {
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum >= target) {
                    int length = j - i + 1;

                    if (length < minLength) {
                        minLength = length;
                    }

                    break;
                }
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int result = shortestSubarray(arr, target);

        System.out.println("Output: " + result);

        sc.close();
    }
}
