import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		int a = rand.nextInt(10);
		System.out.println(a);
		int b = rand.nextInt(100)+1;
		System.out.println(b);
		double c = rand.nextInt(2)+2.5;
		System.out.println(c);
		double d = rand.nextInt(576)+rand.nextDouble()+14;
		System.out.println(d);
	}
}
