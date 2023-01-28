package modulo15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DatasEmJava6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AULA 15.8
		
		LocalDate dataAtual = LocalDate.now();//mostra da data do dia
		
		System.out.println("Data Atual: " + dataAtual);
		
		LocalTime horaAtual = LocalTime.now();
		
		System.out.println("Hora atual: " + horaAtual);
		
		LocalDateTime dataHoraAtual = LocalDateTime.now();
		
		System.out.println("Data e hora atual: " + dataHoraAtual);
		
	

	}

}
