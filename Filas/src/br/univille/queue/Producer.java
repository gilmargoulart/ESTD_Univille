package br.univille.queue;

import java.util.Random;

public class Producer implements Runnable {
	
	private Queue<Integer> queue;
	
	public Producer(Queue queue){
		this.queue = queue;
	}
	
	@Override
	public void run() {
		System.out.println("Produzindo...");
		queue.enqueue(new Random().nextInt(100));
		System.out.println("Produzindo: " + queue);
	}

}
