package main;

import java.util.Locale;
import java.util.Scanner;

import entities.StudentSection8Exercise3;

public class MainStudentSection8Exercise3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		StudentSection8Exercise3 student = new StudentSection8Exercise3();
		
		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
		
		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		} else {
			System.out.println("PASS");
		}
		
		sc.close();
	}
}