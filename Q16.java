import java.util.Scanner;

public class Q16 {

    public static int secondHighestUnique(int[] scores) {
        int highest = 0;
        int secondHighest = 0;

        boolean hasHighest = false;
        boolean hasSecond = false;

        for (int i = 0; i < scores.length; i++) {
            int num = scores[i];

            if (!hasHighest || num > highest) {
                if (hasHighest) {
                    secondHighest = highest;
                    hasSecond = true;
                }

                highest = num;
                hasHighest = true;
            } else if (num < highest &&
                       (!hasSecond || num > secondHighest)) {
                secondHighest = num;
                hasSecond = true;
            }
        }

        if (hasSecond) {
            return secondHighest;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter scores: ");
        String input = sc.nextLine().trim();

        input = input.replace("[", "").replace("]", "").trim();

        if (input.isEmpty()) {
            System.out.println(-1);
            sc.close();
            return;
        }

        String[] parts = input.split(",");
        int[] scores = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            scores[i] = Integer.parseInt(parts[i].trim());
        }

        System.out.println(secondHighestUnique(scores));

        sc.close();
    }
}
