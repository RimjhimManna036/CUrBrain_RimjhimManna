import java.util.Scanner;

public class Q25 {

    public static void getClosestTemps(int[] temps, int target) {

        int left = 0;
        int right = temps.length - 1;

        long bestDifference = Long.MAX_VALUE;

        int first = 0;
        int second = 0;

        boolean found = false;

        while (left < right) {

            long currentSum = (long) temps[left] + temps[right];
            long difference = Math.abs((long) target - currentSum);

            if (difference == 0) {
                System.out.println("(" + temps[left] + ", " + temps[right] + ")");
                return;
            }

            if (difference < bestDifference) {
                bestDifference = difference;
                first = temps[left];
                second = temps[right];
                found = true;
            }

            if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }

        if (found) {
            System.out.println("(" + first + ", " + second + ")");
        } else {
            System.out.println("NONE");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] temps = new int[n];

        System.out.println("Enter sorted array elements:");

        for (int i = 0; i < n; i++) {
            temps[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        System.out.print("Closest pair: ");
        getClosestTemps(temps, target);

        sc.close();
    }
}

