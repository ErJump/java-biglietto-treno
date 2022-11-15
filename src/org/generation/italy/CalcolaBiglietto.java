package org.generation.italy;

import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserire numero di km: ");
		int userKm = sc.nextInt();
		if (userKm < 0) {
			System.out.println("Il numero deve essere positivo");
			return;
		}
		
		System.out.println(userKm);
		
	}
}
