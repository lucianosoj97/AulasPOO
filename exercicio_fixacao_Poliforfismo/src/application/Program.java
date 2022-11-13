package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		Integer N = sc.nextInt();
		
		List<Product> list = new ArrayList<>();
		
		for (int i=1; i<=N; i++) {
			System.out.println();
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if (type == 'c') {
				list.add(new Product(name, price));
			}
				else if (type == 'u') {
					System.out.print("Manufacture date (DD/MM/YYYY): ");
					Date date = sdf.parse(sc.next());
					list.add(new UsedProduct(name, price, date));
			}
				else {
					System.out.print("Customs fee: ");
					double customsFee = sc.nextDouble();
					list.add(new ImportProduct(name, price, customsFee));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product prod : list) {
			System.out.println(prod.Pricetag());
		}
		
		sc.close();
	}

}
