import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner q = new Scanner(System.in);
		System.out.println("Enter a name");
		String name2 = q.nextLine();
		System.out.println("Your name is "+name2);
		System.out.println("Enter a title");
		String title = q.nextLine();
		System.out.println("Your title is "+title);
		System.out.println("Would you like to a Wizard, Warrior, or Rouge (capitalize first letter)");
		String name = q.nextLine();
		if(name.equalsIgnoreCase("Wizard"))
		{
			System.out.println("You selected wizard");
		}
		else if(name.equalsIgnoreCase("Warrior"))
		{
			System.out.println("You selected warrior");
		}
		else if(name.equalsIgnoreCase("Rouge"))
		{
			System.out.println("You selected rouge");
		}
		else
		{
			System.out.println(name+" is not a character option");
		}
		int a = 25;
		int b = a;
		int Strength = 0;
		int Dexterity = 0;
		int Intelligence = 0;
		int Constitution = 0;
		int Charisma = 0;
		System.out.println(" ");
		System.out.println("You have 25 skill points to use");
		String skills = new String();
		while(true)
		{
			b = a;
				if(a==b)
				{
					System.out.println(" ");
						System.out.println("You have "+a+" points left");
							System.out.println(" ");
								System.out.println("Pick from the following classes to put your points into");
									System.out.println(" ");
										System.out.println("Strength, dexterity, intelligence, consitiution, charisma");
											System.out.println(" ");
												System.out.println("You currently have");
													System.out.println(" ");
														System.out.println(Strength+" points in Strength");
															System.out.println(Dexterity+" points in dexterity");
																System.out.println(Intelligence+" points in intelligence");
																	System.out.println(Constitution+" points in constitution");
																		System.out.println(Charisma+" points in Charisma");
																			skills = q.nextLine();
					
					
				}
					if(skills.equalsIgnoreCase("strength"))
					{
						
						System.out.println("How many points would u like to put into strength? (The maximum is 10)(You have "+a+" points left)");
						Strength = q.nextInt()+Strength;
						a = a-Strength;
						
					}
						if(skills.equalsIgnoreCase("dexterity"))
						{
							System.out.println("How many points would u like to put into dexterity? (The maximum is 10)(You have "+a+" points left)");
							Dexterity = q.nextInt()+Dexterity;
							a = a-Dexterity;
							if(Dexterity>10)
									{
										System.out.println("You cannot put more than 10 points in a category");
									}
						}
							if(skills.equalsIgnoreCase("intelligence"))
							{
								System.out.println("How many points would u like to put into intelligence? (The maximum is 10)(You have "+a+" points left)");
								Intelligence = q.nextInt()+Intelligence;
								a = a-Intelligence;
								if(Intelligence>10)
										{
											System.out.println("You cannot put more than 10 points in a category");
										}
							}
								if(skills.equalsIgnoreCase("consitiution"))
								{
									System.out.println("How many points would u like to put into consitiution? (The maximum is 10)(You have "+a+" points left)");
									Constitution = q.nextInt()+Constitution;
									a = a-Constitution;
									if(Constitution>10)
										{
											System.out.println("You cannot put more than 10 points in a category");
										}
								}
									if(skills.equalsIgnoreCase("charisma"))
									{
										System.out.println("How many points would u like to put into charisma? (The maximum is 10) (You have "+a+" points left)");
										Charisma = q.nextInt()+Charisma;
										a = a-Charisma;
										if(Charisma>10)
											{
												System.out.println("You cannot put more than 10 points in a category");
											}
									}
										if(a==0)
										{
											break;
										}
			
			
		}
		
	}
}
