import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner q = new Scanner(System.in);
		System.out.println("Enter your first number");
		int a = q.nextInt();
		System.out.println("Enter your second number");
		int b = q.nextInt();
		System.out.println("Enter your third number");
		int c = q.nextInt();
		if((a>b) && (a>c))
		{
			System.out.println("The first number is the largest");
		}
		if((b>a) && (b>c))
		{
			System.out.println("The second number is the largest");
		}
		if((c>a) && (c>b))
		{
			System.out.println("The third number is the largest");
		}
		if((a<b) && (a<c))
		{
			System.out.println("The first number is the smallest");
		}
		if((b<a) && (b<c))
		{
			System.out.println("The second number is the smallest");
		}
		if((c<a) && (c<b))
		{
			System.out.println("The third number is the smallest");
		}
}
}