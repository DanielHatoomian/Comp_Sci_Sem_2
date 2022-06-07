import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner q = new Scanner(System.in);
		Random rand = new Random();
		int a = rand.nextInt(1000)+1;
		System.out.println("Guess a number from 1 to 1000");
		int b = q.nextInt();
		if(a==b)
		{
			System.out.println("You guessed the correct number");
		}
		if(a>b)
		{
			System.out.println("Too low");
		}
		if(a<b)
		{
			System.out.println("Too high");	
		}
	}
}
