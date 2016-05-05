package estd;

import org.junit.Assert;
import org.junit.Test;

public class Q3SomaNumeros2Igual8Test {
	
	@Test
	public void isSomaNumero2Igual8(){
		
		int[] numeros = {3, 5, 2, 2, 5, 6} ;
		Q3SomaNumeros2Igual8 somaNum2 = new Q3SomaNumeros2Igual8(numeros);
		
		Assert.assertFalse(somaNum2.isSomaNumero2Igual8());

		//Outro teste
		int[] numeros2 = {3, 5, 2, 2, 2, 2};
		somaNum2 = new Q3SomaNumeros2Igual8(numeros2);
		Assert.assertTrue(somaNum2.isSomaNumero2Igual8());
	}
}
