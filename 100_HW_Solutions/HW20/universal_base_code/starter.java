import java.util.*;

class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		ArrayList<Integer> x = new ArrayList<Integer>();
		
		int counter = 0;
		while(counter<=100) {
			x.add(rand.nextInt(100));
			counter++;
		}
		counter = 0;
		while(counter<x.size()) {
			System.out.println(x.get(counter));
			counter++;
		}
		for(int outer = 0; outer<x.size()-1; outer++) {
			for(int inner = 0; inner<x.size()-outer-1; inner++) {
				if(x.get(inner) > x.get(inner+1)) {
					int temp = x.get(inner);
					x.set(inner,x.get(inner+1));
					x.set(inner+1, temp);
				}
			}
		}
		counter = 0;
		System.out.println("");
		System.out.println("");
		System.out.println("");
		while(counter<x.size()) {
			System.out.println(x.get(counter));
			counter++;
		}
		x.clear();
		counter = 0;
		while(counter<=100) {
			x.add(rand.nextInt(100));
			counter++;
		}
		int outer, inner, key;
		
		for(outer = 1; outer<x.size(); outer++) {
			key = x.get(outer);
			inner = outer-1;
			
			while(inner>= 0 && x.get(inner) > key) {
				x.set(inner+1, inner);
				inner = inner - 1;
			}
			x.set(inner+1, key);
		}
		counter = 0;
		while(counter<=x.size()) {
			System.out.println(x.get(counter));
			counter++;
		}
		counter = 0;
		x.clear();
		while(counter<=100) {
			x.set(rand.nextInt(100));
			counter++;
		}
		for(i=0; i<n-1; i++) {
			min_idx=i;
			for(j=i+1; j<n; j++;) {
				if(x.get(j)<x.get(min_idx)) {
					min_idx = j;
				}
			}
			swap(x.get(min_idx),x.get(i));
		}
		counter = 0;
		while(counter<x.size()) {
			System.out.println(x.get(counter));
			counter++;
		}
	}
}
