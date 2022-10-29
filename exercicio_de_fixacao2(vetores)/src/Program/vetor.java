package Program;

import java.util.Locale;
import java.util.Scanner;

public class vetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
	int N = sc.nextInt();
	
	double[] vect = new double [N];
	
	for (int i=0; i <N; i++){
		vect[i] = sc.nextDouble();
	}
	
	double soma = 0;
	
	for (int i=0; i <N; i++){
		soma += vect[i];
	}
	
	double media = soma / N;
	
	System.out.println(String.format("%.2f", media));
	
	
	sc.close();
		
	}

}
