package application;

import java.util.Scanner;
import entities.Salario;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Salario salario = new Salario();
		
		System.out.print("Name: ");
		salario.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		salario.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		salario.tax = sc.nextDouble();
		
		System.out.println();
		System.out.print(salario);
		
		System.out.println();
		System.out.print("Which porcentage to increase salary? ");
		double percentage = sc.nextDouble();
		salario.increaseSalary(percentage);
		
		System.out.println();
		System.out.print("Update: " + salario);
		
		sc.close();

	}

}
