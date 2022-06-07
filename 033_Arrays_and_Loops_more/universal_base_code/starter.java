import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	int[] x = new int[100];
	Random rand = new Random();
	int counter = 0;
	int min = 1000;
	int max = 0;
	int average = 0;
	while(counter<x.length)
	{
		x[counter] = rand.nextInt(100)+1;
		if(x[counter]<min) 
		{
			min = x[counter];
		}
		else if(x[counter]>max)
		{
			max = x[counter];
		}
		System.out.println(x[counter]);
		average = average + x[counter];
		counter = counter+1;
	}
	average = average/100;
	System.out.println("");
	System.out.println("The minimum is: "+min);
	System.out.println("The maximum is: "+max);
	System.out.println("The average is: "+average);
	}
}
