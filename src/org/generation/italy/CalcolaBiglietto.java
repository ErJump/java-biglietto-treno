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
		
		System.out.println(ticketPrice);
		
		
		
	}
}
