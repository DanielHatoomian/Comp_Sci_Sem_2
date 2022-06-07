import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int counter1 = 0;
		int counter2 = 0;
		Wizard[] x = new Wizard[100];
		Warrior[] y = new Warrior[100];
		while(true)
		{
			x[counter1] = new Wizard();
			counter1 = counter1+1;
			y[counter2] = new Warrior();
			counter2 = counter2+1;
			if(counter1==x.length)
			{
				break;
			}
		}
		counter1 = 0;
		counter2 = 0;
		while(true)
			{
				x[counter1].attack(y[counter2]);
				y[counter2].attack(x[counter1]);
				if(x[counter1].isDead())
					{
						counter1 = counter1+1;
					}
						if(x[counter2].isDead())
							{
								counter2 = counter2+1;
							}
								if(x[99].isDead())
									{
										break;
									}
										if(y[99].isDead())
											{
												break;
											}
			}


		
	}
}
