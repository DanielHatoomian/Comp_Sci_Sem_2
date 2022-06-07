import java.util.Scanner;
import java.util.Random;
class starter {
	public static void stringmethod(Object a, Object b) {
		System.out.println(a + " "+b);
	}
	public static void main(String args[]) {
	Scanner q = new Scanner(System.in);
	System.out.println("Input anything");
	Object c = q.nextLine();
	System.out.println("Input a second thing (If you only want to output the first thing then click enter");
	Object d = q.nextLine();
	stringmethod(c, d);



		
	}
}
