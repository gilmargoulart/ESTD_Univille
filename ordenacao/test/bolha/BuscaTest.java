package bolha;

import org.junit.Assert;
import org.junit.Test;

public class BuscaTest {

	@Test
	public void buscaTest() {
		
		Busca busca = new Busca();
		int[] a = {3, 5, 6, 3, 8};
		
		int n = busca.find(a, 6);
		
		Assert.assertEquals(2, n);
	}
}