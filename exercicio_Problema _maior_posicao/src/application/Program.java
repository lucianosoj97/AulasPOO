package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();
		
		double[] numeros = new double[N];
		
		for (int i=0; i<N; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextDouble();
		}
		
		double maior = numeros[0];
	    int posmaior = 0;

	    for (int i=1; i<N; i++) {
	        if (numeros[i] > maior) {
	            maior = numeros[i];
	            posmaior = i;
	        }
	    }
		
		
		System.out.println("MAIOR VALOR = " + String.format("%.1f", maior));
		System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);
		sc.close();

	}

}
