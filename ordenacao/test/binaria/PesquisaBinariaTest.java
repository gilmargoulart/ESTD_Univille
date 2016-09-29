package binaria;

import org.junit.Assert;
import org.junit.Test;

public class PesquisaBinariaTest {

	@Test
	public void test() {
		int[] a = {3, 5, 6, 3, 8};
		PesquisaBinaria busca = new PesquisaBinaria(a);
		
		Assert.assertTrue(busca.find(6));
		
		//Verificar retorno quando não existe
		Assert.assertFalse(busca.find(2));
		Assert.assertFalse(busca.find(9));
		Assert.assertFalse(busca.find(7));
		Assert.assertFalse(busca.find(-50));
		Assert.assertFalse(busca.find(200));
		
		Assert.assertTrue(busca.find(8));
		Assert.assertTrue(busca.find(3));
	}

}
