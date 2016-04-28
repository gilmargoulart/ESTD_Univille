package estd;

import org.junit.Assert;
import org.junit.Test;

public class Q3RetornaSeEhCincoTest {
	
	@Test
	public void testeNumeroCinco(){
		
		//Teste com vetor em que o último numero é 5
		int[] numeros = {1 ,2 ,5};
		Q3RetornaSeEhCinco numero = new Q3RetornaSeEhCinco(numeros);
		//Deverá retonar verdadeiro
		Assert.assertTrue(numero.isFive());
		
		
		//Teste com vetor em que o primeiro numero é 5
		int[] numeros2 = {5, 1, 2, 3};
		numero = new Q3RetornaSeEhCinco(numeros2);
		//Deverá retornar verdadeiro
		Assert.assertTrue(numero.isFive());
		
		
		//Teste com vetor em que não há número 5 nas extremidades
		int[] numeros3 = {13, 5, 1, 2, 3};
		numero = new Q3RetornaSeEhCinco(numeros3);
		//Deverá retornar falso
		Assert.assertFalse(numero.isFive());
	}
}
