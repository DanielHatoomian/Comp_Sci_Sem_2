package pkg;
import java.util.Scanner;
import java.util.Random;


public class Horsebarn {
	//note for self: index of barn = 0 to n-1
	private Horse[] spaces;
	
	public int findHorseSpace(String name) {
		
		int c = 0;
		while(c<spaces.length) {
			if(spaces[c].getName().equals(name)) {
				return c;
				break;
			}
			c++;
		}
		return -1;
		
	}
	public void consolidate() {
		int c = 0;
		int d;
		while(c<spaces.length) {
			d = c+1
			if(space[c].getName().equals(null)) { 
				while(true) {
					if(space[d].getName().equals(null)) {
						if(d==space.length-1) {
							return;
						}
						else {
							d++;
						}
					}
					else {
						break;
					}
				}
				space[c].setName(space[d].getName());
				space[d].setName(null);
				c++;
			}	
		}
	}
	

}
