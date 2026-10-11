import java.util.*;

public class Q8 {

    public static int kthFactor(int n, int k) {
        List<Integer> small = new ArrayList<>();
        List<Integer> large = new ArrayList<>();

        for (int i = 1; i <= n / i; i++) {
            if (n % i == 0) {
                small.add(i);

                int pair = n / i;

                if (pair != i) {
                    large.add(pair);
                }
            }
        }

        int total = small.size() + large.size();

        if (k <= 0 || k > total) {
            return -1;
        }

        Collections.reverse(large);
        small.addAll(large);

        return small.get(k - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n= ");
        int n = sc.nextInt();
        System.out.println("k= ");
        int k = sc.nextInt();

        System.out.println(kthFactor(n, k));

        sc.close();
    }
}
