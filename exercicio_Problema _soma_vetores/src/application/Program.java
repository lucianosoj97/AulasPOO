package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int N = sc.nextInt();
		
		double[] vetA = new double[N];
		double[] vetB = new double[N];
		
		System.out.println("Digite os valores do vetor A:");
		for(int i=0; i<N; i++) {
			vetA[i] = sc.nextDouble();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for(int i=0; i<N; i++) {
			vetB[i] = sc.nextDouble();
		}
		
		double[] vetC = new double[N];
		
		for (int i=0; i<N; i++) {
			vetC[i] = vetA[i] + vetB[i]; 
		}
		
		System.out.println("VETOR RESULTANTE:");
		
		for (int i=0; i<N; i++) {
			System.out.println(vetC[i]);
		}
		
		
		sc.close();
	
		}

}
