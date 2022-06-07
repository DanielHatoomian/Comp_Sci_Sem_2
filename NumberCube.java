package pkg;
import java.util.Scanner;
import java.util.Random;


public class NumberCube {
	int counter;
	Random rand;

	public int getCubeTosses(int x, int y)
		{
				int [] z = new int [y];
			counter = 0;
				while(counter>z.length)
					{
						z[counter] = rand.nextInt(x)+1;
						counter = counter+1;
					}
		}
}