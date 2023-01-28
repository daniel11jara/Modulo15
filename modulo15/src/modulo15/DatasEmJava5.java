package modulo15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava5 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		//aula 15.7
		
		//gerando 12 parcelas
		Date dataInicial  = new SimpleDateFormat("dd/MM/yyyy").parse("08/04/2021");//data da compra
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInicial);
		
		for (int parcela = 0; parcela <= 12; parcela++) {
			calendar.add(Calendar.MONTH, 1);//adicionando 1 mês e repetindo 12 vezes
			
			System.out.println("Parcela número " + parcela + " vencimento em: " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		}
	}

}
