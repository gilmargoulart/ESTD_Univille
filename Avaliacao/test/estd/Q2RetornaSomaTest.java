package estd;

import org.junit.Assert;
import org.junit.Test;

public class Q2RetornaSomaTest {
	
	@Test
	public void testeSoma(){
		
		Q2RetornaSoma n = new Q2RetornaSoma(10);
		
		//Retornar soma...
		int soma = n.getSoma();
		//Verificar a soma. Informando 10 deve retornar 45
		Assert.assertEquals(45, soma);
		
		
		//Mais um teste...
		n = new Q2RetornaSoma(30);
		//Retornar soma...
		soma = n.getSoma();
		//Verificar. Informando 30 deverá retornar 435
		Assert.assertEquals(435, soma);
	}
}
