package diziElemanliarininFrekansý;

import java.util.Arrays;

public class Main {
	

	public static void main(String[] args) {
		int[] array= {10, 20, 20, 10, 10, 20, 5, 20};
		
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		for(int i=0;i<array.length;i++) {
			int counter=0;			
			for(int j=0;j<array.length;j++) {
				if(array[i]==array[j]) {
					counter++;
					
				}				
			
			}
			System.out.println(array[i]+" sayısı dizi içerinde "+counter+" kere tekrar etmektedir.");
			i+=counter-1;
		
		}

	}

}
