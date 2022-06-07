import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[] x;
		int counter;
		x = new int[1000];
		counter = 0;
		Random rand = new Random();
		while(counter<x.length)
		{
			x[counter] = rand.nextInt(100)+1;
			counter = counter+1;
		}
		counter = 0;
		while(true)
		{
			System.out.println(x[counter]);
			counter = counter+1;
		}


		
	}
}
