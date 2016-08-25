package br.univille.prova;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Q1RetornaDuasFilasTest {
	
	@Test
	public void q1RetornaDuasFilasTest (){
		
		int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		Q1RetornaDuasFilas q1 = new Q1RetornaDuasFilas();
		List<Queue<Integer>> l = q1.getQueues(numeros);
		
		//N�meros pares
		Queue<Integer> nPares = l.get(0);
		//N�meros �mpares
		Queue<Integer> nImpares = l.get(1);
		
		//Verificar os n�meros pares
		do {
			if (nPares.front() != null) {
				Assert.assertEquals(0, (nPares.dequeue() % 2));				
			}
		} while(!nPares.isEmpty());
		
		//Verificar os n�meros �mpares
		do {
			if (nImpares.front() != null) {
				Assert.assertNotEquals(0, (nImpares.dequeue() % 2));
			}
		} while(!nImpares.isEmpty());
	}
}