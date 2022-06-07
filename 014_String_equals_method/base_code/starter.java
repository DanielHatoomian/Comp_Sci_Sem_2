import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner q = new Scanner(System.in);
		System.out.println("Would you like to a Wizard, Warrior, or Rouge (capitalize first letter)");
		String name = q.nextLine();
		if(name.equals("Wizard"))
		{
			System.out.println("You selected wizard");
		}
		else if(name.equals("Warrior"))
		{
			System.out.println("You selected warrior");
		}
		else if(name.equals("Rouge"))
		{
			System.out.println("You selected rouge");
		}
		else
		{
			System.out.println(name+" is not a character option");
		}
		
	}
}
