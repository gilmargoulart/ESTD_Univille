package estd;

import org.junit.Assert;
import org.junit.Test;

public class Q5RetornaSeExtremosIguaisTest {
	
	@Test
	public void testRetornaSeExtremosIguais(){
		
		//Inicializar arranjo, em que os extremos s�o diferentes
		int[] num1 = {1, 2, 3};
		Q5RetornaSeExtremosIguais numeros = new Q5RetornaSeExtremosIguais(num1);

		//Retorno deve ser falso
		Assert.assertFalse(numeros.isExtremosIguais());
		
		
		//Outro teste...
		//Inicializar arranjo, onde os extremos s�o iguais
		int[] num2 = {1, 2, 3, 1};
		numeros = new Q5RetornaSeExtremosIguais(num2);
		
		//Retorno deve ser verdadeiro
		Assert.assertTrue(numeros.isExtremosIguais());
			
		
		//Outro teste...
		//Inicializar arranjo, onde os extremos s�o iguais
		int[] num3 = {1, 2, 1};
		numeros = new Q5RetornaSeExtremosIguais(num3);
	
		//Retorno deve ser verdadeiro
		Assert.assertTrue(numeros.isExtremosIguais());
	}
}
