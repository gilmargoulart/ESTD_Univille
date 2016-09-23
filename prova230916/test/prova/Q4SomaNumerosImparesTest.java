package prova;

import org.junit.Assert;
import org.junit.Test;

public class Q4SomaNumerosImparesTest {

	@Test
	public void q4SomaNumerosImparesTest() {
		
		Stack<Integer> stackNumeros = new Stack<Integer>();
		stackNumeros.push(1);
		stackNumeros.push(2);
		stackNumeros.push(3);
		stackNumeros.push(4);
		stackNumeros.push(5);
		stackNumeros.push(6);
		
		//Valor da soma esperado
		int e = 9;
		
		Q4SomaNumerosImpares q4 = new Q4SomaNumerosImpares(stackNumeros);
		
		//Verificar se o retorno de getSomaImpares() é conforme o esperado
		Assert.assertEquals(e, q4.getSomaImpares());
	}
}