package application;

import java.util.Locale;
import java.util.Scanner;

public class listaMaior3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			
			int n, i, j, highest, highestIndex;
			
			System.out.print("How many numbers will you type? ");
			n = sc.nextInt();
			System.out.println();
			
			int[] vect = new int[n];
			
			for (i = 0; i < vect.length; i++) {
				System.out.print("Enter a number: ");
				vect[i] = sc.nextInt();
			}
			
			int[] result = new int[n];
			
			for (i = 0; i < n; i++) {
				highest = vect[0];
				highestIndex = 0;
				for (j = 1; j < vect.length; j++) {
					if (vect[j] > highest) {
						highest = vect[j];
						highestIndex = j;
					}
				}
				result[i] = highest;
				vect[highestIndex] = 0;
					
			}
			
			System.out.println();
			for (i = 0; i < result.length; i++) {
				System.out.print(result[i] + "  ");
			}
			
			
			
		}

	}

}
