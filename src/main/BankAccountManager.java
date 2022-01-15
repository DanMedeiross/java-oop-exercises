package main;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class BankAccountManager {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankAccount account;
		
		System.out.print("Insert a number to create an account: ");
		int number = sc.nextInt();
		
		System.out.print("Insert a name for the holder of the account: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Do you want to insert a value for initial balance of the account? (Y/N): ");
		char option = sc.next().charAt(0);
		
		//int breaker = 1;
		
		//while(breaker == 1) {
			if (option == 'Y') {
				System.out.print("Insert the initial deposit of the account: $ ");
				double amount = sc.nextDouble();
				
				account = new BankAccount(number, name, amount);
				
				//breaker = 0;
				
			} else /* if (option == 'N')*/ {
				account = new BankAccount(number, name);
				sc.nextLine();
				
				//breaker = 0;
				
			} /*else {
				System.out.println("Invalid option.");
				
				System.out.println();
				System.out.print("Do you want to insert a value for initial balance of the account? (Y/N): ");
				option = sc.next().charAt(0);
				breaker = 1;
			}*/
		//}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Insert a value for deposit: $ ");
		account.deposit(sc.nextDouble());
		System.out.println("Deposit accomplished. Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Insert a value for withdraw ($5.00 tax for withdraw operation): $ ");
		account.withdraw(sc.nextDouble());
		System.out.println("Withdraw accomplished. Updated account data: ");
		System.out.println(account);
		
		sc.close();
	}
}