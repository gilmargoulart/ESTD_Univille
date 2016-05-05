package estd;

import org.junit.Assert;
import org.junit.Test;

public class Q2Sequencia22Test {
	
	@Test
	public void hasSequencia22(){
		
		int[] numeros = {3, 5, 6, 2, 2, 4} ;
		Q2Sequencia22 q2Seq = new Q2Sequencia22(numeros);
		
		Assert.assertTrue(q2Seq.hasSequencia22());

		//Outro teste
		int[] numeros2 = {3, 4, 6, 2, 5, 7};
		q2Seq = new Q2Sequencia22(numeros2);
		Assert.assertFalse(q2Seq.hasSequencia22());
	}
}