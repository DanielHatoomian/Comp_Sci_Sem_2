import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Rouge rouge1 = new Rouge("Rouge");
		System.out.println(rouge1.getName());
		Wizard wizard1 = new Wizard();
		System.out.println(wizard1.getName());
		wizard1.printArt();
		Warrior warrior1 = new Warrior();
		System.out.println(warrior1.getName());
		warrior1.printArt();
		


		
	}
}
