package modulo15;

import java.time.Duration;
import java.time.Instant;

public class DatasEmJava9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Instant inicio = Instant.now();
		
		//aula 15.11
		//fazendo uma parada
		Thread.sleep(2000);
		
		Instant iFinal = Instant.now();
		
		//duracao entre o inicio e o final
		Duration duracao = Duration.between(inicio, iFinal);
		
		System.out.println("Duração em nanosegundos: " + duracao.getNano());
		System.out.println("Duração em nanosegundos: " + duracao.toMinutesPart());
		

	}

}
