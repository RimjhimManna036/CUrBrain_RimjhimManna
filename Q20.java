import java.util.*;

public class Q20 {

    public static void suffixSum(int[] nums) {
        int sum = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            int temp = nums[i];
            nums[i] = sum;
            sum += temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        suffixSum(nums);

        System.out.println("Suffix sum array: " + Arrays.toString(nums));

        sc.close();
    }
}

