package pkg;
import java.util.Scanner;
import java.util.Random;


public class HangMan {
	private String guessingWord;
	private int numTries;
	boolean letterExists;
	int lettersFound = 0;
	boolean [] x;
	boolean WinOrLose;

	public HangMan() {
		this.guessingWord = generateWord();
		this.numTries = 5;
		boolean [] x = new boolean[guessingWord.length()];
		lettersFound = guessingWord.length();
	}
	public HangMan(int tries) {
		this.guessingWord = generateWord();
		this.numTries = tries
		boolean [] x = new boolean[guessingWord.length()];
		lettersFound = guessingWord.length();
	}
	public int guessFirst(String letter, int start) {
		int counter = 0;
		letterExists = false;
		
			while(counter<guessingWord.length())
				{
					if(letter.equals(guessingWord.substring(counter, counter+1)))
						{
							x[counter] = true;
							letterExists = true;
							return counter;
							break;
						}
					counter++;
				}
				if(letterExists = false)
					{
						return -1;
					}
			
	}
	public boolean checkWin(boolean [] x)
		{
			int counterBoolean = 0;
			while(counterBoolean<x.length)
				{
					if(x[counterBoolean])
						{
							lettersFound++;
						}
					if(x[counterBoolean] = false)
						{
							WinOrLose = false;
							break;
						}
					if(lettersFound==x.length)
						{
							WinOrLose = true;
						}
				}
				return WinOrLose;
		}
}

