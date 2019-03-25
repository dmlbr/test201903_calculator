package com.lab;

import java.util.Scanner;

public class LiczbaPorzNiePorzystaZakres {


	
	public static void main(String[] args) {
		//int zakres = 34;
		
		//
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println(" podaj start: ");
		int start = scanner.nextInt();
		
		System.out.println("Podaj zakres: " );
		System.out.println("Podaj zakres: " );
		
		int zakres = scanner.nextInt();
		
		System.out.println(" --- ");
			
		//
		
		
		
		
		for (int liczba = start; liczba <= zakres; liczba++) {
			if (czyParzysta(liczba)) {
				System.out.println("Liczba "+ liczba +" jest PARZYSTA");
			} else {
				System.out.println("Liczba "+ liczba +" jest NIEPARZYSTA");
			}
		}
	// zamykamy skanner
		scanner.close();
		
	}

	
	public static boolean czyParzysta(int liczba) {
		return (liczba % 2 == 0);
	}

	
	
}


