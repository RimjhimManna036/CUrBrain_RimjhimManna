import java.util.Scanner;

public class Q21 {

    public static int deleteByValue(int[] arr, int target, int n) {
        int index = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return n;
        }

        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        return n - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        n = deleteByValue(arr, target, n);

        System.out.print("Output: [");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);

            if (i < n - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        sc.close();
    }
}
