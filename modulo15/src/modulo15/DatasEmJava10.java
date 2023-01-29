package modulo15;

import java.time.LocalDate;
import java.time.Period;

public class DatasEmJava10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate dataAntiga = LocalDate.of(2020, 2, 7);
		LocalDate dataNova = LocalDate.of(2023, 1, 15);
		
		//retorna true ou false
		System.out.println("Data antiga é maior que data nova: " + dataAntiga.isAfter(dataNova));
		
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println("Periodo é: " + periodo.getYears() + " meses " + periodo.getMonths() + " e dias " + periodo.getDays());

	}

}
