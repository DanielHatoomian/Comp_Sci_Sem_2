import pkg.*;
import java.util.Scanner;
import java.util.Random;



class starter {
	public static void toStringArray(int x)
	{
		int counter = 0;
		int [] arraytest = new int[x];
		while(arraytest.length>counter)
		{
			arraytest[counter] = counter;
			System.out.println(arraytest[counter]);
			counter = counter+1;
		}
	}
	public static void getArrayAverage(int arraylength, int numblengths)
	{
		Random rand = new Random();
		int counter = 0;
		int average = 0;
		int [] x = new int[arraylength];
		while(x.length>counter)
		{
			x[counter] = rand.nextInt(numblengths);
			System.out.println(x[counter]);
			average = average + x[counter];
			counter = counter+1;
		}
		average=average/counter;
		numblengths = numblengths-1;
		System.out.println("The average is: "+average);
		System.out.println("The array was made of "+arraylength+" integers and the random numbers were from 0 to "+numblengths);
	}
	public static void getArraymin(int arraylength, int numblengths)
	{
		Random rand = new Random();
		int counter = 0;
		int min = numblengths;
		int [] x = new int[arraylength];
		while(x.length>counter)
		{
			x[counter] = rand.nextInt(numblengths);
			if(x[counter]<min)
				{
					min = x[counter];
				}
			System.out.println(x[counter]);
			counter = counter+1;
		}
		System.out.println("");
		System.out.println("The minimum is: "+min);
	}
	public static void getArraymax(int arraylength, int numblengths)
	{
		Random rand = new Random();
		int counter = 0;
		int max = 0;
		int [] x = new int[arraylength];
		while(x.length>counter)
		{
			x[counter] = rand.nextInt(numblengths);
			if(x[counter]>max)
				{
					max = x[counter];
				}
			System.out.println(x[counter]);
			counter = counter+1;
		}
		System.out.println("");
		System.out.println("The maximum is: "+max);
	}
	public static void main(String args[]) {
		Random randintgen = new Random();
		int randomint1 = randintgen.nextInt(100);
		int randomint2 = randintgen.nextInt(100);
		getArraymax(randomint1, randomint2);
		
		getArraymin(randomint1, randomint2);
		
		getArrayAverage(randomint1, randomint2);
		
		toStringArray(randomint1);
		
	}
}
