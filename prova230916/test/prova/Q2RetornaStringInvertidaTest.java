package prova;

import org.junit.Assert;
import org.junit.Test;

public class Q2RetornaStringInvertidaTest {

	@Test
	public void q2RetornaStringInvertidaTest() {
		
		String s = "bicicleta";
		Q2RetornaStringInvertida q2 = new Q2RetornaStringInvertida(s);
		
		//Verificar se a string de retorno coincide com o esperado.
		Assert.assertEquals("atelcicib", q2.retornaStringInvertida());
		
	}
}