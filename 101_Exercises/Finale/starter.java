import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public int median;
	public int mode;
	
	public int getMedian(int [] x) {
		
		if(x.length%2==0)
			{
				median = x[x.length/2];
				return median;
			}
			else if(x.length%2!=0)
				{
					median = x[(x.length/2)+1];
					return median;
				}
			
	}
	public int getMode(int [] x)
		{
			if(x.length<=1)
				{
					return -1;
				}
			int max = 0;
			int counter = 0;
				while(true)
					{
						if(counter>=x.length)
							{
								break;
							}
						if(x[counter]>max)
							{
								max = x[counter];
							}
						counter++;
					}
			int [] checkerArray = new int[max+1];
			int counter2 = 0;
			
				while(counter<x.length)
					{
						counter2 = 0;
							while(true) {
								if(x[counter]==counter2)
									{
										checkerArray[counter2] = checkerArray[counter2] + 1;
										break;
									}
									else
									{
										counter2++;
									}
							counter++;		
							}
					}
				counter2 = 0;
				int maxReps =0;
				while(counter2<checkerArray.length)
					{
						if(checkerArray[counter2]>=maxReps)
							{
								maxReps = checkerArray[counter2];
								mean = counter2;
							}
					}
				return mean;
		}
	
	
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();


		
	}
}
