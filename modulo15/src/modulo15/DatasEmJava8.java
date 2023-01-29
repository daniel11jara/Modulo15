package modulo15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate localDate = LocalDate.now();//pegando a data atual
		System.out.println("Data atual:" + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Dia da semana: " + localDate.getDayOfWeek());

	}

}
