import java.util.Scanner;

public class Q23 {

    public static int minimumSubarraySum(int[] arr) {
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;

            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];

                if (currentSum < minSum) {
                    minSum = currentSum;
                }
            }
        }

        return minSum;
    }

    public static void main(String[] args) {
        System.out.println("Enter arr : ");
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] values = input.trim().split("\\s+");

        int[] arr = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        System.out.println(minimumSubarraySum(arr));

        sc.close();
    }
}
