import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void checkPrime(int a)
{
	Scanner sc = new Scanner(System.in);
	int b = a-1;
	int counter = 0;
	while(true)
	{
		if(a==1)
		{
			System.out.println("The number is not prime");
		}
		if(a==2)
		{
			System.out.println("The number is prime");
			break;
		}
		if(b==1)
		{
			if(counter>0)
			{
				System.out.println("The number is prime");
			}
			if(counter==0)
			{
				System.out.println("The number is not prime");
			}
			break;
		}
		if(a%b==0)
		{
			b = b-1;
			counter = counter+1;
		}
		if(a%b!=0)
		{
			b = b-1;
		}
		
	
		
	}
}
	public static void main(String args[]) {
		System.out.println("Enter a number to check whether it is prime or not");
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		checkPrime(c);


		
	}
}
