package br.univille.prova;

import org.junit.Assert;
import org.junit.Test;

public class Q2InverteStringTest {
	
	@Test
	public void q1RetornaDuasFilasTest (){
		
		Q2InverteString q2 = new Q2InverteString();
		
		String expected = "TesteUnitário";
		String s = "oirátinUetseT";
		//Verificar se a String inicial está invertida
		Assert.assertEquals(expected, q2.inverterString(s));
	}
}