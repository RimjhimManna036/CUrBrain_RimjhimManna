import java.util.*;

public class Q17 {

    public static int mostPopularItem(int[] sales) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int item : sales) {

            if (freq.containsKey(item)) {
                freq.put(item, freq.get(item) + 1);
            } 
            else {
                freq.put(item, 1);
            }
        }

        int maxFreq = 0;
        int result = Integer.MAX_VALUE;

        for (int item : freq.keySet()) {

            int count = freq.get(item);

            if (count > maxFreq) {
                maxFreq = count;
                result = item;
            } 
            else if (count == maxFreq && item < result) {
                result = item;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] sales = new int[n];

        System.out.println("Enter the product IDs:");

        for (int i = 0; i < n; i++) {
            sales[i] = sc.nextInt();
        }

        System.out.println("Most popular item: " + mostPopularItem(sales));

        sc.close();
    }
}