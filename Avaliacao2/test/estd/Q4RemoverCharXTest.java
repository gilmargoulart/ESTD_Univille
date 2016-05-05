package estd;

import org.junit.Assert;
import org.junit.Test;

public class Q4RemoverCharXTest {
	
	@Test
	public void isSomaNumero2Igual8(){
		
		String palavra = "oxamana";
		String palavraEsperada = "oamana";
		Q4RemoverCharX q4RemoverX = new Q4RemoverCharX(palavra);
		
		Assert.assertEquals(palavraEsperada, q4RemoverX.removerCharX());
		
		
		//Outro teste
		palavra = "xxrrfvxx";
		palavraEsperada = "rrfv";
		q4RemoverX = new Q4RemoverCharX(palavra);
		Assert.assertEquals(palavraEsperada, q4RemoverX.removerCharX());
		
		
		//Outro teste
		palavra = "casa";
		palavraEsperada = "casa";
		q4RemoverX = new Q4RemoverCharX(palavra);
		Assert.assertEquals(palavraEsperada, q4RemoverX.removerCharX());
	}
}