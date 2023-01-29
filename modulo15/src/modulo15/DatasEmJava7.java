package modulo15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatasEmJava7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
LocalDate dataAtual = LocalDate.now();//mostra da data do dia
		
		System.out.println("Data Atual: " + dataAtual);
		
		LocalTime horaAtual = LocalTime.now();
		
		System.out.println("Hora atual: " + horaAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss")));//colocando no formato padrão
		
		LocalDateTime dataHoraAtual = LocalDateTime.now();
		
		//aula 15.9
		System.out.println("Data e hora atual: " + dataHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));//colocando no padrão

	}

}











