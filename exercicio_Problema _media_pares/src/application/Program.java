package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int N = sc.nextInt();
		
		int[] vet = new int[N];
		
		for (int i=0; i<N; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		int cont = 0;
		int soma = 0;
		
		for (int i=0; i<N; i++) {
			if (vet[i] %2 == 0) {
				cont = cont + 1;
				soma = soma + vet[i];
			}
		}
		
		double media = soma / cont;
		
		
		if (cont == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}
		else {
			System.out.printf("MEDIA DOS PARES = %.1f\n", media);
		}
		
		
		sc.close();

	}

}
