package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.PessoaJ;
import entities.Dados;
import entities.PessoaF;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Dados> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		Integer N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			System.out.print("Tax payer #"+ i +"data: ");
			System.out.print("Individual or company (f/j)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			Double rendaAnual = sc.nextDouble();
			
			if(ch == 'f') {
				System.out.print("Health expenditures: ");
				double gastoTotal = sc.nextDouble();
				list.add(new PessoaF(name, rendaAnual, gastoTotal));
			}
			else {
				System.out.print("Number of employees: ");
				Double qtdFuncionarios = sc.nextDouble();
				list.add(new PessoaJ(name, rendaAnual, qtdFuncionarios));
			}
		}
			
			double sum = 0.0;
			System.out.println();
			System.out.println("TAXES PAID:");
			for (Dados dados : list) {
				Double taxa = dados.taxa();
				System.out.println(dados.getNome() + " $ " + String.format("%.2f", dados.taxa()));
				sum += taxa;
			}
			
			System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		
		sc.close();

	}

}
