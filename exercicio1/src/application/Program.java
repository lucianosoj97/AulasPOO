package application;

import java.util.Scanner;
import entites.Retangulo;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Retangulo rect = new Retangulo();
		
		System.out.println("Enter rectangle width and height:");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		System.out.print("AREA = " + String.format("%.2f", rect.area()));
		System.out.println();
		System.out.print("PERIMETRO = " + String.format("%.2f", rect.perimetro()));
		System.out.println();
		System.out.print("DIAGONAL = " + String.format("%.2f", rect.diagonal()) );
		
		sc.close();
	}

}
