package pkg;
import java.util.Scanner;
import java.util.Random;


public class BatteryCharger {
	
	private int[] rateTable;
	
	private int GetChargingCost(int starthour, int chargeTime) {
		int charge = 0;
		int counter = 0;
		
		while(counter<=chargetime) {
			if(starthour>=24) {
				starthour = 0;
			}
			charge = charge+rateTable[starthour];
			counter++;
			starthour++;
		}
		return charge;
	}
	public int getChargeStartTime(int chargeTime) {
		int hour = 0;;
		int minCharge;
		int minChargehour;
		while(hour<24) {
				if(minCharge>getChargingCost(hour, chargeTime)) {
					minCharge = getChargingCost(hour, chargeTime);
					minChargehour = hour;
			}
		}
		return minChargehour;
	}
}