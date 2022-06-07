import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int [] arr = new int[200];
		int counter = 0;
		while(counter<arr.length) {
			arr[counter] = rand.nextInt(100)+1;
			counter++;
		}
		for(int outer = 0; outer< arr.length-1; outer++) {
			for(int inner = 0; inner<arr.length-outer-1; inner++) {
				if(arr[inner] > arr[inner+1]) {
					int temp = arr[inner];
					arr[inner] = arr[inner+1];
					arr[inner+1] = temp;
 				}
			}
		}
		counter = 0;
		while(counter<arr.length) {
			System.out.println(arr[counter]);
			counter++;
		}
	}
}
