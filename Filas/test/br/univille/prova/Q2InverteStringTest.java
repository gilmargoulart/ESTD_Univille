package br.univille.prova;

import org.junit.Assert;
import org.junit.Test;

public class Q2InverteStringTest {
	
	@Test
	public void q1RetornaDuasFilasTest (){
		
		Q2InverteString q2 = new Q2InverteString();
		
		String expected = "TesteUnit�rio";
		String s = "oir�tinUetseT";
		//Verificar se a String inicial est� invertida
		Assert.assertEquals(expected, q2.inverterString(s));
	}
}