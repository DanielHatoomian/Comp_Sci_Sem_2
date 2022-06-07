import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a phrase");
		String phrase = sc.nextLine();
		int a = phrase.length();
		System.out.print(phrase.substring(a-1));
		a = a-1;
		while(true)
		{
			if(a==-1)
				{
					break;
				}
					else if(a>0)
						{
							System.out.print(phrase.substring(a-1, a));
							a = a-1;
						}
		}
	
	
	
	}
}
