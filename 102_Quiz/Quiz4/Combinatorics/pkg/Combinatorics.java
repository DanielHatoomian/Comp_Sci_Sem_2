package pkg;
import java.util.Scanner;
import java.util.Random;


public class Combinatorics {
	
	
	public static int factorial(int n) {
		int sum = 1;
		if(n==1) {
			return 1;
		}
		while(n>0) {
			sum = n*sum;
			n = n-1;
		}	
		return sum;
	}
	public static void numCombinations(int n, int r) {
		int choices;
		if(r>n) {
			System.out.println("There are 0 ways of choosing "+r+" items from "+n+" choices.");
			return;
		}
		else if(r==n) {
			System.out.println("There is 1 way of choosing "+r+" items from "+n+" choices");
			return;
		}
		else if(r<n) {
			choices = factorial(n)/(factorial(r)*factorial(n-r));
		}
		
	}

}
