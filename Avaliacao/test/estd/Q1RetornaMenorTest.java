package estd;

import org.junit.Assert;
import org.junit.Test;

public class Q1RetornaMenorTest {
	
	@Test
	public void testeRetornaMenor(){
		
		//Inicializar veror com numeros aleatórios.
		int[] n = {4, 5, 6, 9, 2, 8};
		Q1RetornaMenor numeros = new Q1RetornaMenor(n);
		
		//Retornar menor número
		int menorNumero = numeros.getMenor();
		//Conferir o menor número, de acordo com o informado no vetor anterior
		Assert.assertEquals(2, menorNumero);

		//Outro teste...
		int[] n2 = {90, 132, 2345, 5656, 345, 96, 5, 6, 123, 56, 78, 46, 73, 9, 54, 8};
		numeros = new Q1RetornaMenor(n2);
		
		//Retornar menor número
		menorNumero = numeros.getMenor();
		//Conferir o menor número, de acordo com o informado no vetor anterior 
		Assert.assertEquals(5, menorNumero);
	}
}