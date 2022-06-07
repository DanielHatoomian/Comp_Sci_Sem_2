import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String entword = sc.nextLine();
		for(int counter = 0; counter<entword.length(); counter++)
		{
			System.out.println(entword.substring(counter, counter+1));
		}

		
	}
}
