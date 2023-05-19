package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class listaMaiorProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			
			
			int n, i, j, highest, highestIndex;
			
			List<Integer> list = new ArrayList<>();
			
			System.out.print("How many numbers will you type? ");
			n = sc.nextInt();
			System.out.println();
			
			int[] vect = new int[n];
			
			for (i = 0; i < vect.length; i++) {
				System.out.print("Enter a number: ");
				vect[i] = sc.nextInt();
			}
			
			for (i = 0; i < vect.length; i++) {
				list.add(vect[i]);
			}
			
			int[] result = new int[n];
			
			for (j = 0; j < n; j++) {
				highest = list.get(0);
				highestIndex = 0;
				for (i = 1; i < list.size(); i++) {
					if (list.get(i) > highest) {
						highest = list.get(i); 
						highestIndex = i;
					}
				}
				result[j] = highest;
				list.remove(highestIndex);	
			}
			
			System.out.println();
			for (i = 0; i < result.length; i++) {
				System.out.print(result[i] + "  ");
			}
			
			
			
		}

	}

}
