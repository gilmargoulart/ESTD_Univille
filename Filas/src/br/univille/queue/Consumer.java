package br.univille.queue;

public class Consumer implements Runnable {
	
	private Queue<Integer> queue;
	
	public Consumer(Queue queue){
		this.queue = queue;
	}
	
	@Override
	public void run() {
		int i = queue.dequeue();
		System.out.println("Consumindo " + i + "...");
		
	}

}
