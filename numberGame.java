import java.util.*;

public class numberGame {
    private static int minNumber;
    private static int maxNumber;
    private static int maximumAttempts;

    public static void playNumberGame() {
        Scanner scanner = new Scanner(System.in);
        Random ranNum = new Random();
        int generatedNumber = ranNum.nextInt(maxNumber - minNumber + 1) + minNumber;
        int attempts = 0;

        do {
            System.out.println("Guess a number between 1 to 100: ");
            int guessedNumber = scanner.nextInt();
            attempts++;

            if (guessedNumber == generatedNumber) {
                System.out.println("Congratulations! You won the game in " + attempts + " attempts.");
                return;
            } else if (guessedNumber < generatedNumber) {
                System.out.println("The number is Less than the generated Number. Try again.");
            } else {
                System.out.println("The number is Greater than the generated Number. Try again.");
            }
        }while (attempts < maximumAttempts);

        System.out.println("Sorry, the correct number is: " + generatedNumber + ". You played well.");
    }

    public static void main(String[] args) {
        minNumber = 1;
        maxNumber = 100;
        maximumAttempts = 5;

        playNumberGame();
    }
}
