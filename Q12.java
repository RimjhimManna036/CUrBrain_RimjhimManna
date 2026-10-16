import java.util.Scanner;

public class Q12 {

    static long moduloPower(long base, int power, long MOD) {
        long result = 1 % MOD;

        for (int i = 0; i < power; i++) {
            result = (result * base) % MOD;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter base : ");
        long base = sc.nextLong();
        System.out.println("Enter power: ");
        int power = sc.nextInt();
        System.out.println("Enter MOD: ");
        long MOD = sc.nextLong();

        long result = moduloPower(base, power, MOD);

        System.out.println("Result: "+result);

        sc.close();
    }
}
