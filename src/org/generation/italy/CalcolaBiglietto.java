package org.generation.italy;

import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserire numero di km: ");
		int userKm = sc.nextInt();
		if (userKm < 0) {
			System.out.println("Il numero di km deve essere positivo");
			return;
		}
		
		System.out.print("Inserire l'età: ");
		int userAge = sc.nextInt();
		if (userAge < 0) {
			System.out.println("l'età deve essere un numero positivo");
			return;
		}
		
		sc.close();
		
		double ticketPrice = ((double) userKm) * 0.21;
		
		if (userAge <= 12) {
			ticketPrice = 0;
			System.out.println("Hai meno di 12 anni, hai il diritto a viaggiare gratis!");
		} else if (userAge < 18) {
			ticketPrice = ticketPrice * 0.8;
			System.out.println("Sei minorenne, hai diritto ad uno sconto del 20%");
		} else if (userAge > 65) {
			ticketPrice = ticketPrice * 0.6;
			System.out.println("Sei over 65, hai diritto ad uno sconto del 40%");
		}
		
		String ticketPriceFormat = String.format("%.2f", ticketPrice); 

		System.out.println("Il prezzo del biglietto è: " + ticketPriceFormat + "€");
	}
}
