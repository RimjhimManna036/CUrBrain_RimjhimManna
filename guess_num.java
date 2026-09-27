import java.util.Scanner;
import java.util.Random;

public class guess_num {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int number = random.nextInt(100) + 1;

        int attempts = 0;
        int guess;

        System.out.println("========================");
        System.out.println("      CUrBrain");
        System.out.println("   NUMBER GUESSING GAME");
        System.out.println("========================");

        System.out.println("Guess a number between 1 and 100!");

        do {
            System.out.print("\nEnter your guess: ");
            guess = sc.nextInt();

            attempts++;

            if (guess > number) {
                System.out.println("Too high! Try again.");
            }
            else if (guess < number) {
                System.out.println("Too low! Try again.");
            }
            else {
                System.out.println(" Congratulation!You won");
                System.out.println("The number was: " + number);
                System.out.println("Attempts: " + attempts);
            }

        } while (guess != number);

        sc.close();
    }
}