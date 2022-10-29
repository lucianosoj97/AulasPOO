package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;


public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Banco banco;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter a deposit value: ");
			double value = sc.nextDouble();
			banco = new Banco(number, holder, value);
		}
		else {
			banco = new Banco(number, holder);
		}
		
		System.out.println();
		System.out.println("Accont data:");
		System.out.println(banco);
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		banco.deposit(depositValue);
		System.out.println("Update accont data: ");
		System.out.println(banco);
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withDraw = sc.nextDouble();
		banco.whithdraw(withDraw);
		System.out.println(banco);
		
		
		sc.close();

	}

}
