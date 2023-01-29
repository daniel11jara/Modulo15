package modulo15;

import java.time.LocalDate;

public class DatasEmJava11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//aula 15.13
		LocalDate dataBase = LocalDate.parse("2019-10-05");
		//adicionando 5 dias
		System.out.println("Mais 5 dias: " + dataBase.plusDays(5));
		
		System.out.println("Mais 5 semanas: " + dataBase.plusWeeks(5));
		
		System.out.println("Mais 5 anos: " + dataBase.plusYears(5));

	}

}
