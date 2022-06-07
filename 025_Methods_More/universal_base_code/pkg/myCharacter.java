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
		role ="No role";
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
public int setStrength(int a)
{
	strength = a;
	return strength;
}
public int setDexterity(int a)
{
	dexterity = a;
	return dexterity;
}
public int setConstitution(int a)
{
	constitution = a;
	return constitution;
}
public int setIntelligence(int a)
{
	intelligence = a;
	return intelligence;
}
public int setCharisma(int a)
{
	charisma = a;
	return charisma;
}
public String setRole(String b)
{
		if(role.equals("wizard"))
	{
		role = b;
	}
	else if(role.equals("warrior"))
	{
		role = b;
	}
	else if(role.equals("rouge"))
	{
		role = b;
	}
	else
	{
		System.out.println("Not a valid role option");
	}
	return role;
}
public boolean setAll(String b, int a, int c, int d, int e, int f)
{
	strength = a;
	dexterity = c;
	constitution = d;
	intelligence = e;
	charisma = f;
	if(b.equals("wizard"))
	{
		role = b;
	}
	else if(b.equals("warrior"))
	{
		role = b;
	}
	else if(b.equals("rouge"))
	{
		role = b;
	}
	else
	{
		System.out.println("Not a valid role option");
	}
	return true;
	
}
	}

	

	

