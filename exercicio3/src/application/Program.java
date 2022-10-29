package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Nota;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Nota nota = new Nota();
		
		System.out.print("Name: ");
		nota.name = sc.nextLine();
		nota.nota1 = sc.nextDouble();
		nota.nota2 = sc.nextDouble();
		nota.nota3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + nota.mediaFinal());
		
		if (nota.mediaFinal() > 60) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
			System.out.println("MISSING " + String.format("%.2f",nota.passouOuNao()) + " poins.");
		}
		
		sc.close();

	}

}
