package prova;

import org.junit.Assert;
import org.junit.Test;


public class Q1RetornaParesTest {

	@Test
	public void q1RetornaParesTest() {
		
		int[] numeros = {1, 4, 5, 9, 8, 6, 3, 20, 11};
		
		Queue<Integer> expected = new Queue<>(numeros.length);
		expected.enqueue(4);
		expected.enqueue(8);
		expected.enqueue(6);
		expected.enqueue(20);
		
		Q1RetornaPares q1 = new Q1RetornaPares(numeros);
		Queue<Integer> queue = q1.retornaPares();
		
		//Verificar tamanho da fila.
		Assert.assertEquals(4, queue.size());
		
		int i = 0;
		//Verficar se a fila contem apenas numeros pares.
		while (queue.size() > 0) {
			//Resto da divisão não pode ser diferente de zero.
			i = queue.dequeue();
			if (i % 2 != 0) {
				Assert.fail("Número " + i + " não é par.");
				break;
			}
		}
	}
}