import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name (First, last) (No middle name)");
		String s  = sc.nextLine();
		int a = s.indexOf(" ")+1;
		System.out.println(s.substring(a));
		


		
	}
}
