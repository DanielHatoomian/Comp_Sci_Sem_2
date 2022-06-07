import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int a = rand.nextInt(1001);
		Scanner q = new Scanner(System.in);
		System.out.println("GUess a number from 1-1000");
		int guess = q.nextInt();
		while(true)
		{
			if(a!=guess)
			{
				System.out.println("Incorrect, guess again");
				guess = q.nextInt();
			}
			if(a==guess)
			{
				break;
			}
		}



		
	}
}
