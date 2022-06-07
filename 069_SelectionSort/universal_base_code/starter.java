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
		int outer, inner, key;
		
		for(outer = 1; outer< arr.length; outer++) {
			key = arr[outer];
			inner = outer-1;
			
			while(inner >= 0 && arr[inner] > key){
				arr[inner+1] = arr[inner];
				inner = inner - 1;
			}
			arr[inner + 1] = key;
		}
		counter = 0;
		while(counter<arr.length) {
			System.out.println(arr[counter]);
			counter++;
		}
		
	}
}
