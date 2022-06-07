import pkg.*;
import java.util.Scanner;
import java.util.Random;

class MyCharacter {
	String role;
	public MyCharacter() {
		role ="No role";
	}
	public MyCharacter(String a) {
		if(a.equals("wizard"))
		{
			System.out.println("You chose wizard");
			role = "Wizard";
		}
		if(a.equals("rouge"))
		{
			System.out.println("You chose rouge");
			role = "Rouge";
		}
		if(a.equals("warrior"))
		{
			System.out.println("You chose warrior");
			role = "Warrior";
		}
		else
		{
			System.out.println("This is not a valid role");
			role = "No role";
		}
		
	}
}
class starter {
	public static void main(String args[]) {
		MyCharacter Joe = new MyCharacter();
		System.out.println(Joe.role);
		MyCharacter Joe2 = new MyCharacter("warrior");
		
		
		
		
	
	
		
	}
}
