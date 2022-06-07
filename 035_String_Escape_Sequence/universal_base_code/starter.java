import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int randomresponse = 0;
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Write a pet peeve.");
		String petpeeve =sc.nextLine();
		while(true)
		{
			randomresponse = rand.nextInt(4);
			if(petpeeve.equalsIgnoreCase("stop"))
				{
					break;
				}
					else
						{
							if(randomresponse==0)
								{
									System.out.println("You sure like to complain a lot");
								}
									if(randomresponse==1)
										{
											System.out.println("Mocking: "+petpeeve);
										}
											if(randomresponse==2)
												{
													System.out.println("Stop complaining about "+petpeeve);
												}
													if(randomresponse==3)
														{
															System.out.println("I hate "+petpeeve+" too");
														}
						}
						System.out.println("Write another pet peeve, if you would like to stop, type stop");
						petpeeve =sc.nextLine();
		}
		
		
	}
}
