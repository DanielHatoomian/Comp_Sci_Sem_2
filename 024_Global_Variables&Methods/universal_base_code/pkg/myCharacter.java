package pkg;
import java.util.Scanner;
import java.util.Random;
public class myCharacter {
	public int strength = 0;
	public int dexterity = 0;
	public String role = "no role";
	public int constitution = 0;
	public int intelligence = 0;
	public int charisma = 0;
	public myCharacter(){
		role ="Wizard";
		strength = 7;
		dexterity = 4;
		constitution = 5;
		intelligence = 10;
		charisma = 9;
	}
		public void myToString()
{
	System.out.println("Your role is: "+role);
	System.out.println("Your strength trait is: "+strength);
	System.out.println("Your dexterity trait is: "+dexterity);
	System.out.println("Your constitution trait is: "+constitution);
	System.out.println("Your intelligence trait is: "+intelligence);
	System.out.println("Your charisma trait it: "+charisma);
}
	}

	

	

