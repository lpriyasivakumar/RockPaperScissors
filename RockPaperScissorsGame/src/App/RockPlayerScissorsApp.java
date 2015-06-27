package App;

import java.util.Scanner;
import model.*;

public class RockPlayerScissorsApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name = "";

		System.out.println("Welcome to Rock Paper Scissors");
		System.out.println("Enter your name: ");
		name = sc.next();
		User userOne = new User(name);
		Player userTwo;

		System.out
				.println("Would you like to play against The Jets or TheSharks (j/s)");
		String playerType = validChoice(sc,"j","s");
		userTwo = castPlayer(playerType);
		rockPaperScissors(sc, userOne, userTwo);
		sc.close();

	}

	private static Player castPlayer(String playerType) {
		if (playerType.equalsIgnoreCase("j")) {
			return new Jets();

		} else {
			return new Sharks();
		}
	}

	private static void rockPaperScissors(Scanner sc, User userOne,
			Player userTwo) {
		String choice;
		do {
			System.out.println("Rock,paper or scissors? (R/P/S)");
			String rps = rpsValidate(sc,"R","P","S");
			userOne.setRoshambo(rps);
			System.out.printf("%s :%s\n", userOne.name,
					userOne.generateRoshambo());
			System.out.printf("%s :%s\n", userTwo.name,
					userTwo.generateRoshambo());
			pickWinner(userOne, userTwo);
			System.out.println("Play Again?:(y/n)");
			choice = sc.next();

		} while (choice.equalsIgnoreCase("y"));
	}

	private static void pickWinner(User userOne, Player userTwo) {
		if (userOne.val.compareTo(userTwo.val) == 0) {
			System.out.println("Draw!");
		} else {
			compareValues(userOne, userTwo);
		}

	}

	public static void compareValues(User userOne, Player userTwo) {
		Roshambo r1 = userOne.val;
		Roshambo r2 = userTwo.val;
		if ((r1 == Roshambo.PAPER) && (r2 == Roshambo.ROCK)
				|| ((r1 == Roshambo.ROCK) && (r2 == Roshambo.SCISSORS))
				|| ((r1 == Roshambo.SCISSORS) && (r2 == Roshambo.PAPER))) {
			System.out.println(userOne.name + " wins");
		} else {
			System.out.println(userTwo.name + " wins");
		}
	}

	public static String validChoice(Scanner sc, String one, String two) {
		String choice = "";
		while (true) {
			choice = sc.next();
			if (!choice.equalsIgnoreCase(one) && !choice.equalsIgnoreCase(two)) {
				System.out.println("Invalid entry: Try Again");
			} else {
				break;
			}
		}
		return choice;
	}

	public static String rpsValidate(Scanner sc, String one, String two,
			String three) {
		String choice = "";
		while (true) {
			choice = sc.next();
			if (!choice.equalsIgnoreCase(one) && !choice.equalsIgnoreCase(two)
					&& !choice.equalsIgnoreCase(three)) {
				System.out.println("Invalid entry: Try Again");
			} else {
				break;
			}
		}
		return choice;

	}
}
