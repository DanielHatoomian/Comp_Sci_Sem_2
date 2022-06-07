import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		dwarf[] x = new dwarf[100];
		int counter = 0;
		int nameset;
		while(true)
			{
					if(counter==x.length)
					{
						break;
					}
				x[counter] = new dwarf();
					counter = counter+1;
			}
			counter = 0;
		while(true)
			{
					if(counter==x.length)
					{
						break;
					}
				nameset = rand.nextInt(7)+1;
				if(nameset==1)
					{
						x[counter].setName("Grumpy");
					}
				if(nameset==2)
					{
						x[counter].setName("Dopey");
					}
				if(nameset==3)
					{
						x[counter].setName("Doc");
					}
				if(nameset==4)
					{
						x[counter].setName("Happy");
					}
				if(nameset==5)
					{
						x[counter].setName("Bashful");
					}
				if(nameset==6)
					{
						x[counter].setName("Sneezy");
					}
				if(nameset==7)
					{
						x[counter].setName("Sleepy");
					}
				counter = counter+1;
				
			}
			counter = 0;
			while(true)
				{
					if(counter==x.length)
						{
							break;
						}
					x[counter].setAge(rand.nextInt(100)+1);
					counter = counter+1;
				}
			counter = 0;
			while(true)
				{
					if(counter==x.length)
						{
							break;
						}
					System.out.println(x[counter].getName());
					System.out.println(x[counter].getAge());
					counter = counter+1;
				}
			counter = 0;
			while(true)
			{
				if(x.length==counter)
					{
						break;
					}
						else
							{
								if(x[0].isSameName(x[counter].getName()))
								{
									System.out.println(x[counter].getName());
									System.out.println("Number "+counter+" has the same name as number 0");
								}
								counter = counter+1;
							}
			}
			
		
	}
}
