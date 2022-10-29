package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N, i;
		double[] vet = new double[100];
		
		System.out.print("Quantos numeros voce vai digitar? ");
		N = sc.nextInt();
		
		for (i=0; i<N; i++) {
			System.out.print("Digite um numero: ");
		vet[i] = sc.nextDouble();
		}
		
		System.out.print("VALORES = ");
		
		for (i=0; i<N; i++) {
			System.out.printf("%.1f  ",vet[i]);
		}
		
		double soma = 0;
		
		for (i=0; i<N; i++) {
			soma = soma + vet[i];
		}
		
		System.out.println();
		System.out.println("SOMA = " + soma);
		
		double media = soma / N;
		
		System.out.println("MEDIA = " + media);
	
		
		sc.close();
	
	}

}
