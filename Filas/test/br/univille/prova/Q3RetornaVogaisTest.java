package br.univille.prova;

import org.junit.Assert;
import org.junit.Test;

public class Q3RetornaVogaisTest {
	
	@Test
	public void q1RetornaDuasFilasTest (){
		
		Q3RetornaVogais q3 = new Q3RetornaVogais();
		
		Queue<Character> queue = new Queue<>(8);
		queue.enqueue('a');
		queue.enqueue('r');
		queue.enqueue('d');
		queue.enqueue('w');
		queue.enqueue('y');
		queue.enqueue('i');
		queue.enqueue('e');
		queue.enqueue('w');
		//Verificar se adicionou os 8 caracteres
		Assert.assertEquals(8, queue.size());
		
		Queue<Character> vogais = q3.retornarVogais(queue);

		//Deve conter as 3 vogais
		Assert.assertEquals(3, vogais.size());
		
		//Verificar se há somente as vogais
		Assert.assertEquals(new Character('a'), vogais.dequeue());
		Assert.assertEquals(new Character('i'), vogais.dequeue());
		Assert.assertEquals(new Character('e'), vogais.dequeue());
		
		//Verificar se está vazio
		Assert.assertTrue(vogais.isEmpty());
	}
}