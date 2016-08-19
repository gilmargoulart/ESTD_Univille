package br.univille.queue;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ConsumerProducerMain {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new Queue<>(20);
				
		Producer p = new Producer(queue);
		Consumer c = new Consumer(queue);
		
		//Executar Threads simultâneas
		ScheduledExecutorService pool = Executors.newScheduledThreadPool(2);
		
		//Agendar execução a cada 2 segundos
		pool.scheduleAtFixedRate(p, 0, 1, TimeUnit.SECONDS);
		pool.scheduleAtFixedRate(c, 0, 2, TimeUnit.SECONDS);
	}
}
