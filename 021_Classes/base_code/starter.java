import pkj.starter;
import java.util.Scanner;
import java.util.Random;
class Character {
	String role ="Wizard";
	int strength = 7;
	int dexterity = 4;
	int constitution = 5;
	int intelligence = 10;
	int charisma = 9;
		
	}

	
class starter {
	public static void main(String args[]) {
		Character myCharacter = new Character();
		System.out.println("Role: "+myCharacter.role);
		System.out.println(" ");
		System.out.println("Stats");
		System.out.println("Strength: "+myCharacter.strength);
		System.out.println("Dexterity: "+myCharacter.dexterity);
		System.out.println("Constitution: "+myCharacter.constitution);
		System.out.println("Intelligence: "+myCharacter.intelligence);
		System.out.println("Charisma: "+myCharacter.charisma);



		
	}
}
