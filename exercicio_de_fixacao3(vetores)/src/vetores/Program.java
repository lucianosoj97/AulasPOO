package vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Produto[] vetor = new Produto[N];
		
		for (int i=0; i<vetor.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vetor[i] = new Produto(name, price);
		}
		
		double soma = 0;
		
		for (int i=0; i<vetor.length; i++) {
			soma += vetor[i].getPrice();
		}
		
		double media = soma / vetor.length;
		
		System.out.println("AVERAGE PRICE = " + String.format("%.2f", media));
		
		
		
		sc.close();

	}

}
