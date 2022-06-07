import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void checkPrime(int a)
{
	Scanner sc = new Scanner(System.in);
	
	int counter = 0;
	while(a>1)
	{
		counter = 0;
		int b = a-1;
		while(true)
		{
			if(a==2)
			{
				System.out.print(" "+a);
				break;
			}
			if(b==1)
			{
				if(counter>0)
				{
					System.out.print(" "+a);
				}
				if(counter==0)
				{
					
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
		a = a-1;
	}
}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number, it will list all the prime numbers lower than it.");
		int c = sc.nextInt();
		checkPrime(c);
	
	
	
	}
}
