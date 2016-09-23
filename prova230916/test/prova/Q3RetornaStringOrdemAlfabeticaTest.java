package prova;

import org.junit.Assert;
import org.junit.Test;


public class Q3RetornaStringOrdemAlfabeticaTest {

	@Test
	public void test() {
		String s = "bicicleta"; //Atual
		String e = "abcceiilt"; //Expected
		
		Q3RetornaStringOrdemAlfabetica q3 = new Q3RetornaStringOrdemAlfabetica(s);
		
		//Verificar se o retorno do método getStringOrdemAlfabetica() é conforme o esperado.
		Assert.assertEquals(e, q3.getStringOrdemAlfabetica());
	}

}
