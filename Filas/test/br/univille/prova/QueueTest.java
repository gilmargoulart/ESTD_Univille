package br.univille.prova;

import org.junit.Assert;
import org.junit.Test;



public class QueueTest {

	
	@Test
	public void enqueueTest() {
		Queue<String> queue = new Queue<>(5);
		queue.enqueue("A");
		queue.enqueue("B");
		queue.enqueue("C");
		queue.enqueue("D");
		queue.enqueue("E");
		queue.dequeue();
		queue.dequeue();
		queue.enqueue("F");
		queue.enqueue("G");
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.enqueue("H");
		queue.enqueue("I");
		queue.dequeue();
		queue.enqueue("J");
		queue.enqueue("K");
		queue.enqueue("L");
		queue.enqueue("M");
		queue.enqueue("N");
		queue.enqueue("O");
		queue.enqueue("P");
		System.out.println(queue);
		
	}
	
}
