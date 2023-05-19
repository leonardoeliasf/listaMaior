package application;

import java.util.Locale;
import java.util.Scanner;

public class listaMaior2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			
			int n, i, j, key;
			
			System.out.print("How many numbers will you type? ");
			n = sc.nextInt();
			System.out.println();
			
			int[] vect = new int[n];
			
			for (i = 0; i < vect.length; i++) {
				System.out.print("Enter a number: ");
				vect[i] = sc.nextInt();
			}
			
			for (j = 1; j < vect.length; j++) {
				key = vect[j];
				i = j - 1;
				while (i >= 0 && vect[i] > key) {
					vect[i + 1] = vect[i];
					i = i - 1;
					vect[i + 1] = key;
				}
			}
			
			System.out.println();
			for (i = 0; i < vect.length; i++) {
				System.out.print(vect[i] + "  ");
			}
			
			
			
			
		}

	}

}
