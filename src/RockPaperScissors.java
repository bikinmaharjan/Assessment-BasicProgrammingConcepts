import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	private int rounds = 3;
	private int ties = 0;
	private int computerWins = 0;
	private int userWins = 0;
	

	public int result(int user) {
		Random random = new Random();
		int comp = random.nextInt(3) + 1;
		System.out.println("Computer picks " + comp);
		if (user == 1) {
			if (comp == 1) {
				System.out.println("Tie");
				return 0;
			} else if (comp == 2) {
				System.out.println("Paper Wraps Rock! Computer wins");
				return 1;
			} else {
				System.out.println("Rock breaks Scissors! You win");
				return 2;
			}
		} else if (user == 2) {
			if (comp == 1) {
				System.out.println("Paper Wraps Rock! You win");
				return 2;
			} else if (comp == 2) {
				System.out.println("Tie");
				return 0;
			} else {
				System.out.println("Scissor cuts Paper! Computer wins");
				return 1;
			}
		} else if (user == 3) {
			if (comp == 1) {
				System.out.println("Rock breaks Scissors! Computer wins");
				return 1;
			} else if (comp == 2) {
				System.out.println("Scissors cuts Paper! You win");
				return 2;
			} else {
				System.out.println("Tie");
				return 0;
			}
		} else {
			System.out.println("Invalid input!!!");
			System.out.println("Computer wins by default");
			return 1;
		}
	}

	public void play() {
		RockPaperScissors rps = new RockPaperScissors();
		Scanner input = new Scanner(System.in);
		System.out.println("        ***** ROCK PAPER SCISSORS *****");
		System.out.println("How many games do you want to play 1-10");
		rps.rounds = input.nextInt();
		System.out.println("___________________________________________________________");
		while (rps.rounds > 0) {
			System.out.println("Choose 1 for Rock, 2 for Paper and 3 for Scissors");
			int user = input.nextInt();
			int r = rps.result(user);

			if (r == 0) {
				rps.ties++;
			} else if (r == 1) {
				rps.computerWins++;
			} else if (r == 2) {
				rps.userWins++;
			}
			rps.rounds--;
			System.out.println("______________________");
			System.out.println("User Wins: " + rps.userWins);
			System.out.println("Computer Wins: " + rps.computerWins);
			System.out.println("Tie: " + rps.ties);
			System.out.println("___________________________________________________________");
		}

		System.out.println("************************************************************");
		if (rps.userWins > rps.computerWins) {
			System.out.println("              Congratulations!!! YOU WON !!!!!!!");
		} else if (rps.userWins < rps.computerWins) {
			System.out.println("              Sorry!!! YOU LOST !!!!!!!!!");
		} else {
			System.out.println("              It's A TIE!!!!!!!!!");
		}
		System.out.println("************************************************************");
	}

	public static void main(String[] args) {
		RockPaperScissors r = new RockPaperScissors();
		int s = 1;
		while (s == 1) {
			r.play();
			Scanner input = new Scanner(System.in);
			System.out.print("Do you want to play again? (1 for yes or 0 for no) ");
			s = input.nextInt();
		}
		System.out.println("Thanks for Playing :) :) :)");

	}
}
