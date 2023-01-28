package modulo15;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.text.ParseException;

public class DatasEmJava4 {

	public static void main(String[] args) throws ParseException {
		
		//aula 15.6
		
		//chronounit é um pacote estático não precisa instanciar
		//dias entre 01/02/2021 e hoje
		//retorna um long
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-02-01"), LocalDate.now());
		
		System.out.println("Possui " + dias + " entre a faixa de datas");
	}

}
