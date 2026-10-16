import java.util.Scanner;

public class Q13 {

    static boolean checkDivisiblePrefix(int[] arr, int n, int k) {
        long sum = 0;
        long mod = k;

        if (mod < 0) {
            mod = -mod;
        }

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];

            if (sum % mod == 0) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");
        int n = sc.nextInt();
        System.out.println("Enter elements in array: ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k : ");
        int k = sc.nextInt();

        boolean result = checkDivisiblePrefix(arr, n, k);
        System.out.println("Result: "+result);

        sc.close();
    }
}
