import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner q = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = q.nextLine();
		System.out.println("Your name is "+name);
		System.out.println("Enter your age");
		String age = q.nextLine();
		System.out.println("You are "+age+" years old");
		System.out.println("What month were you born in?");
		String month = q.nextLine();
		System.out.println("You were born in "+month);
		System.out.println("What day of "+month+" were you born in");
		String day = q.nextLine();
		System.out.println("You were born on the "+day+"th of "+month);
		System.out.println("What year were you born");
		String year = q.nextLine();
		System.out.println("You were born in the year "+year);
		System.out.println("How much is a buck fifty");
		String buckfifty = q.nextLine();
		System.out.println(buckfifty+" is a buck fifty");
	}
}
