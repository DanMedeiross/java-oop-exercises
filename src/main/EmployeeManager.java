package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class EmployeeManager {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		// PART 1 - READING DATA:
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ": ");
			
			System.out.println("Id: ");
			int id = sc.nextInt();
			while(hasId(list, id)) {
				System.out.println("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));
		}
		
		// PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:
		
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		// PART 3 - LISTING EMPLOYEES: 
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}
	
	/*public static int hasId(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return -1;
	}*/
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}