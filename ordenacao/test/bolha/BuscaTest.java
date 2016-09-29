package bolha;

import org.junit.Assert;
import org.junit.Test;

public class BuscaTest {

	@Test
	public void buscaTest() {
		
		Busca busca = new Busca();
		int[] a = {3, 5, 6, 3, 8};
		
		Assert.assertEquals(2, busca.find(a, 6));
		
		//Verificar retorno quando não existe
		Assert.assertEquals(-1, busca.find(a, 2));
	}
}