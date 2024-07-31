import java.util.Scanner;

class RangeGenerator {
    public int generate(int max, int min) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RangeGenerator rangeGenerator = new RangeGenerator();
        boolean playAgain = true;
        int totalScore = 0;
        int round = 1;

        while (playAgain) {
            System.out.println("Round " + round);
            System.out.println("Enter the minimum number:");
            int min = sc.nextInt();
            System.out.println("Enter the maximum number:");
            int max = sc.nextInt();

            int targetNumber = rangeGenerator.generate(max, min);
            int attempts = 0;
            int maxAttempts = 5; 

            while (attempts < maxAttempts) {
                System.out.println("Guess a number between " + min + " and " + max + ":");
                int guess = sc.nextInt();
                attempts++;

                if (guess > targetNumber) {
                    System.out.println("It's Greater");
                } else if (guess < targetNumber) {
                    System.out.println("It's Lower");
                } else {
                    System.out.println("Correct guess! You guessed it in " + attempts + " attempts.");
                    totalScore += maxAttempts - attempts + 1; 
                    break;
                }

                if (attempts == maxAttempts) {
                    System.out.println("You've reached the maximum attempts. The correct number was " + targetNumber);
                }
            }

            System.out.println("Your score for this round: " + (maxAttempts - attempts + 1));
            System.out.println("Total Score: " + totalScore);
            round++;

            System.out.println("Do you want to play another round? (yes/no)");
            String response = sc.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Final Score: " + totalScore);
        
        sc.close();
    }
}
