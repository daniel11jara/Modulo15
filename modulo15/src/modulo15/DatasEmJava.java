package modulo15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
	
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();//aula 15.3
		
		Date date = new Date();
		
		System.out.println("Data em milisegundos: " + date.getTime());
		System.out.println("Calendar em milisegundos: " + calendar.getTimeInMillis());
		
		System.out.println("Dia do mês: " + date.getDate());
		System.out.println("Calendar dia do mês: " + calendar.get(Calendar.DAY_OF_MONTH));//fazendo a mesma coisa utilizando o calendar
		
		System.out.println("Dia da semana: " + date.getDay());
		System.out.println("Calendar dia da semana: " + calendar.get((Calendar.DAY_OF_WEEK) - 1));
		// retorna uma numeração, retorna a partir do zero
		
		System.out.println("Hora do dia: " + date.getHours());
		System.out.println("Calendar hora do dia: " + calendar.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("Minuto da hora: " + date.getMinutes());
		System.out.println("Calendar minuto da hora: " + calendar.get(Calendar.MINUTE));
		
		System.out.println("Ano: " + (date.getYear() + 1900));
		
		//aula 15.2
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy  HH:mm.ss");
		
		System.out.println("Data atual em formato padrão e string: " + simpleDateFormat.format(date));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");//para ser usado em banco de dados
		
		System.out.println("Data para banco de dados: " + simpleDateFormat.format(date));
	}

}
