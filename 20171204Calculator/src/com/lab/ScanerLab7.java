package com.lab;

import java.util.Scanner;

public class ScanerLab7 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("---:");
		
		//String imie = scanner.next(); // do spacji
		String imie = scanner.nextLine();
		
		System.out.println("Wita! "+imie);
		
		System.out.println("Ile masz lat?");
		
		int wiek = scanner.nextInt();
		
		
		if (wiek < 18) {
			
			System.out.println("Jests mlody");
			
			
			
		} else {
			
			System.out.println("Masz " + wiek + " lat");
			
		}
		
		// zamykamy skaner
		scanner.close();
		
		
	}
	
	
	
}
