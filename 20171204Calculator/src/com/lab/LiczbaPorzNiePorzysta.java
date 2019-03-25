package com.lab;

import java.util.Scanner;

public class LiczbaPorzNiePorzysta {


	
	public static void main(String[] args) {
		//int zakres = 34;
		
		//
		Scanner scanner = new Scanner(System.in);
		
		int zakres = scanner.nextInt();
		
		System.out.println(" --- ");
			
		//
		
		
		
		
		for (int liczba = 0; liczba <= zakres; liczba++) {
			if (czyParzysta(liczba)) {
				System.out.println("Liczba "+ liczba +" jest PARZYSTA");
			} else {
				System.out.println("Liczba "+ liczba +" jest NIEPARZYSTA");
			}
		}
		
		scanner.close();
		
	}

	
	public static boolean czyParzysta(int liczba) {
		return (liczba % 2 == 0);
	}

	
	
}


