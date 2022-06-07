import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 100);
		printValuesInt(arr1);
		removeDup(arr1);		//Create this method.
		printValuesInt(arr1);
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add(((int)(Math.random()*100)));
		}
	}
	
	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
	public static void removeDup(ArrayList<Integer> arr) {
		boolean x = true;
		while(x = true) {
			int counter = 0;
			int counter2 = counter+1;
			while(true) {
				if(arr.length==1) {
					x = false;
				}
				if(counter>=arr.length()) {
					break;
				}
				if(counter2==arr.length()) {
					counter2 = 1;
					counter++;
				}
				if(arr(counter)==arr(counter2)) {
					arr.remove(counter2);
					break;
				}
			}
		}
	}
}
