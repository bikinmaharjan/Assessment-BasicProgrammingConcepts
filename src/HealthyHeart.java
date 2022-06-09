import java.util.Scanner;

public class HealthyHeart {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What is your age? ");
		int age = input.nextInt();
		int maxHeartRate = 220 -age;
		int lowTarget = (int)(0.5 * maxHeartRate);
		int highTarget = (int) (0.85 * maxHeartRate);
		System.out.println("Your maximum heart rate should be " + maxHeartRate +" beats per minute");
		System.out.println("Your target HR zone is " + lowTarget + " - " + highTarget + " beats per minute");
		input.close();
	}
}
