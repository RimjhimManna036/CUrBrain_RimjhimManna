import java.util.Scanner;

public class Q15 {

    public static int minimumAbsoluteValue(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int currentAbs;
            int minAbs;

            if (arr[i] < 0) {
                currentAbs = -arr[i];
            } else {
                currentAbs = arr[i];
            }

            if (min < 0) {
                minAbs = -min;
            } else {
                minAbs = min;
            }

            if (currentAbs < minAbs) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array: ");
        String input = sc.nextLine().trim();

        input = input.replace("[", "").replace("]", "").trim();

        if (input.isEmpty()) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }

        String[] parts = input.split(",");
        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i].trim());
        }

        System.out.println(minimumAbsoluteValue(arr));

        sc.close();
    }
}
