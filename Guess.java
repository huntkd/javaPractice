import java.util.Random;
import java.util.Scanner;

class Guess {

	public static void main(String[] args) {
		System.out.println("Guess a number between 1-1000:");

		Random randomGenerator = new Random();
		Scanner scanner = new Scanner(System.in);
		int r = randomGenerator.nextInt(1000) + 1;
		int guess = scanner.nextInt();
		int guesses = 1;

		while (guesses<=7 && guess != r) {
			guesses ++;

			if (guess > r) {
				System.out.println("Too high");
			} else {
				System.out.println("Too low");
			}

			System.out.println("Guess again");
			guess = scanner.nextInt();
		}

		if (guesses >= 7) {
			System.out.println("You lose");
		} else {
			System.out.println("You win");	
		}


	}
}