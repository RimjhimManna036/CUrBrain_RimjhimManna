import java.util.Scanner;

public class Q14 {

    public static int[] thresholdFilter(int[] sales, int threshold) {

        if (threshold < 0) {
            return null;
        }

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < 0) {
                return null;
            }
        }

        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= threshold) {
                count++;
            }
        }

        int[] result = new int[count];
        int j = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= threshold) {
                result[j] = sales[i];
                j++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sales: ");
        String input = sc.nextLine();

        input = input.replace("[", "").replace("]", "").trim();

        int[] sales;

        if (input.isEmpty()) {
            sales = new int[0];
        } else {
            String[] parts = input.split(",");
            sales = new int[parts.length];

            for (int i = 0; i < parts.length; i++) {
                sales[i] = Integer.parseInt(parts[i].trim());
            }
        }

        System.out.print("Enter threshold: ");
        int threshold = sc.nextInt();

        int[] result = thresholdFilter(sales, threshold);

        if (result == null) {
            System.out.println("Invalid input");
        } else {
            System.out.print("[");
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i]);
                if (i < result.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }

        sc.close();
    }
}
