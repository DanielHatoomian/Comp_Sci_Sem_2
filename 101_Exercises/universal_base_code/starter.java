import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Ascii one = new Ascii();
		one.printArt();
		
		Ascii two = new Ascii("human");
		two.printArt();
		
		
		Ascii three = new Ascii("dog", "Cliffard");
		three.printArt();
		
		
		Ascii four = new Ascii("dog", 3);
		four.printArt();
		
		Ascii five = new Ascii();
		five.setType("human");
		five.setName("Joe");
		five.setNumber(5);
		five.printArt();
		
		Ascii six = new Ascii();
		six.setType("owl");
		six.setName("Joe");
		six.setNumber(2);
		six.printArt();
		
	}
}
