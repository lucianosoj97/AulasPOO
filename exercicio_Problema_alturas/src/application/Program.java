package application;

import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int N = sc.nextInt();
		
		double somaAltura, mediaAltura, menor16;
	
		String[] nome = new String[100];
		int[] idade = new int[100];
		double[] altura = new double[100];
		
		for (int i=0; i<N; i++) {
			System.out.println("Dados da "+ (i+1) +"a pessoa:");
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}
		
		somaAltura = 0;
		for (int i=0; i<N; i++) {
			somaAltura = somaAltura + altura[i];
		}
		
		mediaAltura = somaAltura / N;
		
		menor16 = 0;
		for (int i=0; i<N; i++) {
			if (idade[i]<16) {
				menor16 = menor16 + 1;
			}
		}
		
		double porcentagemDeMenor = menor16 * 100.0 / N;
		
		
		System.out.println();
		System.out.println("Altura media: " + String.format("%.2f", mediaAltura));
		System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", porcentagemDeMenor + "%"));
		
		for (int i=0; i<N; i++) {
			if (idade[i]<16) {
				System.out.println(idade[i]);
			}
		}
		
				
				
		sc.close();
		
	}

}
