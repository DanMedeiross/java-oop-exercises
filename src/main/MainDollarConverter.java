package main;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class MainDollarConverter {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the Dollar price? ");
		CurrencyConverter.dollarPrice = sc.nextDouble();
		System.out.print("How many Dollars will be bought? ");
		CurrencyConverter.dollarQuantity = sc.nextDouble();
		System.out.printf("Amount to be paid in Reais = %.2f%n", CurrencyConverter.converter());
		
		sc.close();
	}
}