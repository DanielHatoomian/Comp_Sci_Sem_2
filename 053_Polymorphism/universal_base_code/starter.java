import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Performer [] x = new Performer[4];
		x[0] = new Performer();
		x[1] = new Musician();
		x[2] = new Apprentice();
		x[3] = new Actor();
		
		x[0].perform();
		x[0].practice();
		
		x[1].perform();
		((Performer)x[1]).practice();
		
		x[2].practiceAtUniversity();
		(x[2]).playInstrument();
		
		x[3].monolouge();
		((Performer)x[3]).perform();
	}
}
