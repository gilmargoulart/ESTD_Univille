package br.univille.prova;

import org.junit.Assert;
import org.junit.Test;

public class Q4RetornaSomaTest {
	
	@Test
	public void q1RetornaDuasFilasTest (){
		
		Q4RetornaSoma q4 = new Q4RetornaSoma();
		
		//Pilha com números
		Stack<Integer> pilha = new Stack<>();
		Assert.assertTrue(pilha.isEmpty());
		//Adicionar números na pilha
		pilha.push(1);
		pilha.push(5);
		pilha.push(4);
		pilha.push(8);
		pilha.push(2);
		Assert.assertEquals(5, pilha.getSize());
		
		Assert.assertEquals(20, q4.retornaSoma(pilha));
	}
}