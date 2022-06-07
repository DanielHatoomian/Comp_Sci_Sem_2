import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Musician x = new Musician("Travis Scott", "Drums");
		Musician y = new Musician("Kanye West", 23, "Tuba");
		
		x.getName();
		x.practice();
		x.getInstrument();
		
		y.getName();
		y.perform();
		y.playInstrument();


		
	}
}
