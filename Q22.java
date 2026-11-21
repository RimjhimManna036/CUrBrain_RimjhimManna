import java.util.Scanner;
import java.util.Arrays;

public class Q22 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int x = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] >= nums2[p2]) {
                nums1[x] = nums1[p1];
                p1--;
            } else {
                nums1[x] = nums2[p2];
                p2--;
            }
            x--;
        }

        while (p2 >= 0) {
            nums1[x] = nums2[p2];
            p2--;
            x--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter m: ");
        int m = sc.nextInt();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] nums1 = new int[m + n];
        int[] nums2 = new int[n];

        System.out.print("Enter nums1 elements: ");
        for (int i = 0; i < m + n; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter nums2 elements: ");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        merge(nums1, m, nums2, n);

        System.out.println("Merged array: " + Arrays.toString(nums1));

        sc.close();
    }
}
