package br.univille.queue;

import org.junit.Assert;
import org.junit.Test;

import br.univille.queue.Queue;

public class QueueTest {

	@Test
	public void test() {
		Queue<Integer> q = new Queue<Integer>();
		
		System.out.println(q.toString());
		
		//Verificar se a fila criada está com tamanho zerado e em branco.
		Assert.assertEquals(0, q.getSize());
		Assert.assertTrue(q.isEmpty());
		
		//Adicionar elemento 5
		q.enqueue(5);
		Assert.assertEquals(1, q.getSize());
		Assert.assertFalse(q.isEmpty());
		System.out.println(q.toString());
		
		//Adicionar elemento 6
		q.enqueue(6);
		Assert.assertEquals(2, q.getSize());
		Assert.assertFalse(q.isEmpty());
		System.out.println(q.toString());
		
		//Remover elemento 5 da fila
		Assert.assertEquals(5, q.dequeue().intValue());
		Assert.assertEquals(1, q.getSize());
		Assert.assertFalse(q.isEmpty());
		System.out.println(q.toString());
		
		//Remover elemento 6 da fila
		Assert.assertEquals(6, q.dequeue().intValue());
		Assert.assertEquals(0, q.getSize());
		Assert.assertTrue(q.isEmpty());
		System.out.println(q.toString());
		
	}
}