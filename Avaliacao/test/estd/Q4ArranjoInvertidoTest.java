package estd;

import org.junit.Assert;
import org.junit.Test;

public class Q4ArranjoInvertidoTest {
	
	@Test
	public void testeArranjoInvertido(){
		
		//Inicialziar arranjo
		int[] num = {1, 2, 3};
		//Inicializar arranjo com mesmo elementos do arranjo anterior, mas de forma invertida
		int[] esperado = {3, 2, 1};
		
		Q4ArranjoInvertido numeros = new Q4ArranjoInvertido(num);
		
		//Verificar se o retorno é o arranjo invertido
		Assert.assertArrayEquals(esperado, numeros.getNumerosOrdemInvertida());
		
		
		//Outro teste...
		int[] num2 = {5, 11, 9};
		int[] esperado2 = {9, 11, 5};
		
		numeros = new Q4ArranjoInvertido(num2);
		
		//Verificar se o retorno é o arranjo invertido
		Assert.assertArrayEquals(esperado2, numeros.getNumerosOrdemInvertida());
		
		
		//Outro teste...
		int[] num3 = {7, 0, 0};
		int[] esperado3 = {0, 0, 7};
		
		numeros = new Q4ArranjoInvertido(num3);
		
		//Verificar se o retorno é o arranjo invertido
		Assert.assertArrayEquals(esperado3, numeros.getNumerosOrdemInvertida());
	}
}