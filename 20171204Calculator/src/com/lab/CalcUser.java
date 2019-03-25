package com.lab;

import java.util.Scanner;

public class CalcUser {
	
	public static void main(String[] args) {
		
		Scanner wpis_z_Klawisz = new Scanner(System.in);
		
		
		System.out.println("Pierwsza liczba: ");
		int aa = wpis_z_Klawisz.nextInt();
		
		System.out.println("Druga liczba: ");
		int bb = wpis_z_Klawisz.nextInt();
		
		
		
		
		
		
		System.out.println("---------- Co z nimi robimy --------");
		System.out.println("1. +");
		System.out.println("2. *");
		System.out.println("====================================");
		
		int operacjaNumar = wpis_z_Klawisz.nextInt(); 
		
		int wynik;
		
		switch (operacjaNumar) {
		case 1:
			wynik = (int) Kalkulat.summa(aa, bb);
			System.out.println(aa + " + " + bb + " = " + wynik);
			break;
			
		case 2:
			
			break;

		default:
			break;
		}
		Kalkulat.summa(aa, bb);
		
		
		
		
	}

}
