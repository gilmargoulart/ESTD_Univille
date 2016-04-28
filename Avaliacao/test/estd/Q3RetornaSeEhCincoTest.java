package estd;

import org.junit.Assert;
import org.junit.Test;

public class Q3RetornaSeEhCincoTest {
	
	@Test
	public void testeNumeroCinco(){
		
		//Teste com vetor em que o �ltimo numero � 5
		int[] numeros = {1 ,2 ,5};
		Q3RetornaSeEhCinco numero = new Q3RetornaSeEhCinco(numeros);
		//Dever� retonar verdadeiro
		Assert.assertTrue(numero.isFive());
		
		
		//Teste com vetor em que o primeiro numero � 5
		int[] numeros2 = {5, 1, 2, 3};
		numero = new Q3RetornaSeEhCinco(numeros2);
		//Dever� retornar verdadeiro
		Assert.assertTrue(numero.isFive());
		
		
		//Teste com vetor em que n�o h� n�mero 5 nas extremidades
		int[] numeros3 = {13, 5, 1, 2, 3};
		numero = new Q3RetornaSeEhCinco(numeros3);
		//Dever� retornar falso
		Assert.assertFalse(numero.isFive());
	}
}
