package pkg;

public class CVMath {
	static boolean x;
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	public static boolean PerfectSquare(int a) {
		//finds if the number has a perfect square root
		int counter = 0;
		while(true) {
			if(counter > a) {
				x = false;
				break;
			}
			int test = counter*counter;
			if(test == a) {
				x = true;
				break;
			}
			counter++;
		}
		return x;
	}
	public static boolean MagicSquare(int b) {
		int counter = 1;
		int sum = 1;
		if(PerfectSquare(b)){ //checks to see if the number is a Magic Square in addition to being a Perfect Square
			while(counter<b) {
				sum = counter + sum;
				if(sum<b) {
					if(sum!=b) {
						x = false;
						break;
					}
					else if(sum==b) {
						x = true;
						break;
					}
				}
			}
			counter++;
		}
		return x;
	}
	
	public static void MagicSquarePrint(int c) {
		if(MagicSquare(c)) {
			System.out.println(c + " is a Magic Square");
		}
		else {
			System.out.println(c + " is not a Magic Square");
		}
	}
}
