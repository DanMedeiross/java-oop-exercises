package main;

import java.util.Locale;
import java.util.Scanner;

import entities.RectangleSection8Exercise1;

public class MainRectangleSection8Exercise1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		RectangleSection8Exercise1 rectangle = new RectangleSection8Exercise1();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rectangle.area());
		System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());
		
		sc.close();
	}
}