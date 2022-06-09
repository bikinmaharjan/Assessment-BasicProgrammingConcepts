import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What is your dog's name? ");
		String name = input.next();
		System.out.println("Well then, I have this highly reliable report on " + name + " prestigious background right here.");
		
		System.out.println(name + " Esquire is: ");
		
		Random random = new Random();
		int g1 = random.nextInt(100);
		System.out.println(g1 + "% St. Bernard");
		int g2 = random.nextInt(100-g1);
		System.out.println(g2 + "% chihuahua");
		int g3 = random.nextInt(100-g1-g2);
		System.out.println(g3 + "% Dramatic RedNosed Asian Pug");
		int g4 = random.nextInt(100-g1-g2-g3);
		System.out.println(g4 + "% Common Cur");
		int g5 = 100-g1-g2-g3-g4;
		System.out.println(g5 + "% King Doberman");
		System.out.println();
		System.out.println("Wow, that's QUITE the dog! ");
		
		input.close();
	}
}
