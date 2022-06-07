package pkg;
import java.util.Scanner;
import java.util.Random;

public class combinedTable {
	int seats;
	double desirability;
	SingleTable t1;
	SingleTable t2;
	
	public combinedTable(SingleTable t1, SingleTable t2) {
		this.seats = (t1.getNumSeats() + t2.getNumSeats()) - 2;
		this.t1 = t1;
		this.t2 = t2;
	}
	public boolean canSeat(int x) {
		if(x>this.seats) {
			return false;
		}
		else if(x<=this.seats) {
			return true;
		}
	}
	public double getDesirability(combinedTable x) {
		if(t1.getHeight()==t2.getHeight()) {
			this.desirability = (t1.getHeight() + t2.getHeight())/2;
			return this.desirability;
		}
		else if(t1.getHeight()!=t2.getHeight) {
			this.desirability = ((t1.getHeight()+t2.getHeight())/2)-10;
		}
	}
	
	
}