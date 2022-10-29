package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employe;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employe> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered: ");
		Integer N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			System.out.println("Employee #" + (i+1) + ":");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			System.out.print("");
		
			Employe emp = new Employe(N, null, null);
			list.add(emp);
		}
			
		
		System.out.print("Enter the employee that will be have salary increase: ");
		Integer idsalary = sc.nextInt();
		System.out.print();
		
		
		sc.close();

	}
	
	Integer hasID(List<Embloyee> list, int id) {
		
	}

}
