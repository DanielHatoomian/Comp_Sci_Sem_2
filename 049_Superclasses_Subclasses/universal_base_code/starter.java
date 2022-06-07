import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Performer x = new Performer();
		Performer y = new Performer("Travis Scott", 23);
		
		Musician x1 = new Musician();
		Musician x2 = new Musician("Tuba");
		
		x.getName();
		x.practice();
		
		y.getName();
		y.practice();
		
		x1.getName();
		x1.perform();
		x1.playInstrument();
		
		x2.practice();
		System.out.println(x2.getInstrument());
		
		
	}
}
