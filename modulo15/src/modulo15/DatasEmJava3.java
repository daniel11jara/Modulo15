package modulo15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava3 {
	
	public static void main(String[] args) throws ParseException {
		
		
		//aula 15.5
		
		Calendar calendar = Calendar.getInstance();//pega a data atual
		
		//simular que data vem do banco de dados
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2021"));//definindo uma data
		
		calendar.add(Calendar.DAY_OF_MONTH, 5);//adicionando 5  dias na data acima
		
		System.out.println("Somando o dia do mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.MONTH, 1);//somando 1 mês
		
		System.out.println("Somando o mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
	}
	

}
