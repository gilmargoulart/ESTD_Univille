package estd;

import org.junit.Assert;
import org.junit.Test;


public class Q1DiferencaMaiorMenorTest {
	
	@Test
	public void diferencaMaiorMenor(){
		
		int[] numeros = {5, 8, 9, 2};
		Q1DiferencaMaiorMenor q1Diff = new Q1DiferencaMaiorMenor(numeros);
		
		Assert.assertEquals(7, q1Diff.getDiferencaMaiorMenor());

		//Outro teste
		int[] numeros2 = {9,25,4,25,36,98,1,8,4,2};
		q1Diff = new Q1DiferencaMaiorMenor(numeros2);
		
		Assert.assertEquals(97, q1Diff.getDiferencaMaiorMenor());
	}
}