import java.util.Scanner;
import java.util.Random;

class starter {
		public static int mathpower(int a, int b) {
			int counter = 0;
			int c = a;
			while(true)
			{
				counter = counter+1;
				if(b==0)
				{
					c = 1;
					break;
				}
				else if(counter>=b)
				{
					break;
				}
				else if(counter<b)
				{
					c = (c*a);
				}
				
			}
			return c;
		}
	public static void main(String args[]) {
		Scanner q = new Scanner(System.in);
		System.out.println("Enter your first number");
		int a = q.nextInt();
		System.out.println("Enter your second number");
		int b = q.nextInt();
		int c = mathpower(a, b);
		System.out.println(a+" to the power of "+b+" is "+c);


	
	}
}
