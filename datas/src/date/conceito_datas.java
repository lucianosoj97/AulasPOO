package date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class conceito_datas {

	public static void main(String[] args) {
		
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2022-10-26");
		LocalDateTime d05 = LocalDateTime.parse("2022-10-26T01:30:26");
		Instant d06 = Instant.parse("2022-10-26T01:30:26Z");
		Instant d07 = Instant.parse("2022-10-26T01:30:26-03:00");
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDate d09 = LocalDate.of(2022, 07, 20);
		LocalDateTime d10 = LocalDateTime.of(2022, 07, 20, 1, 30);
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		
		System.out.println("--------------------------------");
		//COLOCANDO NO FORMATO BRASILEIRO

		LocalDate d11 = LocalDate.parse("2022-10-26");
		LocalDateTime d12 = LocalDateTime.parse("2022-10-26T01:30:26");
		Instant d13 = Instant.parse("2022-10-26T01:30:26Z");
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		System.out.println("d11 = " + d11.format(fmt2));
		System.out.println("d12 = " + d12.format(fmt3));
		System.out.println("d13 = " + fmt4.format(d13));
	
		System.out.println("--------------------------------");
		//COVERTENDO DATA E HORTA GLOBAL PARA LOCAL
		
		
		LocalDate r1 = LocalDate.ofInstant(d13, ZoneId.systemDefault()); 
		//Ent??o com isso aqui eu vou converter o meu instante para uma data local, considerando o fuso hor??riodo meu computador.
		System.out.println("R1 = " + r1);
		
		LocalDateTime r2 = LocalDateTime.ofInstant(d13, ZoneId.systemDefault()); 
		System.out.println("R2 = " + r2);
		
		//Pegando o dia de uma data Local.
		
		System.out.println("d11 = " + d11.getDayOfMonth());
		System.out.println("d11 = " + d11.getMonthValue());
		System.out.println("d11 = " + d11.getYear());
		
	}

}
