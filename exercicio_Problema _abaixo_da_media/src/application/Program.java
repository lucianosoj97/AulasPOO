package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int N = sc.nextInt();
		
		double[] vet = new double[N];
		
		for (int i=0; i<N; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		double soma = 0;
		
		for (int i=0; i<N; i++) {
			soma = soma + vet[i];
		}
		
		double media = soma / N;
		
		System.out.printf("\nMEDIA DO VETOR = " + String.format("%.3f", media));
		System.out.println("\nELEMENTOS ABAIXO DA MEDIA:");
		
		for (int i=0; i<N; i++) {
			if (vet[i] < media) {
				System.out.println(vet[i]);
			}
		}
		
		sc.close();

	}

}
