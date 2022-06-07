import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int randcount = 0;
		while(randcount<100)
		{
			int randnumber = rand.nextInt(100)+1;
			System.out.println(randnumber);
			randcount = randcount+1;
		}
		
		
		
	}
}
