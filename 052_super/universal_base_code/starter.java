import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Apprentice a = new Apprentice();
		Apprentice b = new Apprentice("Crescenta Valley High School", 2);
		Apprentice c = new Apprentice("Drums", "Crescenta Valley High School", 3);
		Apprentice d = new Apprentice("Daniel", 16, "Drums", "Crescenta Valley High School", 4);
		
		a.playInstrument();
		b.practice();
		c.perform();
		d.practiceAtUniversity();

		
	}
}
