package application;

import java.util.Scanner;


public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();
		
		int[] vetor = new int[N];
		
		for (int i=0; i<N; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("NUMEROS NEGATIVOS:");
		
		for (int i=0; i<N; i++) {
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}
		
		
		sc.close();

	}

}
