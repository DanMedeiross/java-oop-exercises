package main;

import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeSection8Exercise2;

public class MainEmployeeSection8Exercise2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		EmployeeSection8Exercise2 employee = new EmployeeSection8Exercise2();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Employee: " + employee);
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		System.out.println();
		
		System.out.printf("Updated data: " + employee);
	
		sc.close();
	}
}