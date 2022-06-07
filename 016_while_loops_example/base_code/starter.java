import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner q = new Scanner(System.in);
		System.out.println("Enter a name");
		String name = q.nextLine();
		System.out.println("How many times would you like your name repeated");
		int amountoftimes = q.nextInt();
		int a = 0;
		while(true)
			{
				if(a<amountoftimes)
					{
						System.out.println(name);
						a = a+1;
					}
				if(a>=amountoftimes)
					{
						break;
					}
				
			}



		
	}
}
