package modulo15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava2 {
	
	public static void main(String[] args) throws ParseException {
		
		//aula 15.4 
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = simpleDateFormat.parse("10/04/2021"); //data de vencimento do boleto
		
		Date dataAtualHoje = simpleDateFormat.parse("07/04/2021");
		
		if (dataVencimentoBoleto.after(dataAtualHoje)) {//compara as duas datas. Data de vencimento e atual
			//data de vencimento passou da data atual?
			System.out.println("Boleto não vencido");
			
		} else {
			System.out.println("Boleto não vencido - URGENTE");
		}
	}
	

}
