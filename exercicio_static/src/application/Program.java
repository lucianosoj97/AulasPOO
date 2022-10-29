package application;

import java.util.Locale;
import java.util.Scanner;

import calculo.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dolla price? ");
		CurrencyConverter.price = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		CurrencyConverter.quantity = sc.nextDouble();
		
		System.out.print("Amont to be paid is reais = " + CurrencyConverter.amont());
		
		sc.close();

	}

}
