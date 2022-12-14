package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Luciano");
		list.add("Luciana");
		list.add("Bruna");
		list.add("Joao");
		list.add(2, "Pedro");
		
		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
			}
		System.out.println("-----------------------------");
		list.removeIf(x -> x.charAt(0) == 'L');
		for (String x : list) {
			System.out.println(x);
			}
		System.out.println("-----------------------------");
		System.out.println("Index of Bruna: " + list.indexOf("Bruna"));
		System.out.println("Index of Lucas: " + list.indexOf("Lucas"));
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList());
		System.out.println("-----------------------------");
		list.removeIf(x -> x.charAt(0) == 'L');
		for (String x : result) {
			System.out.println(x);
			}
		
		System.out.println("-----------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'W').findFirst().orElse("Não localizado");
		System.out.println(name);
		
	}


}
