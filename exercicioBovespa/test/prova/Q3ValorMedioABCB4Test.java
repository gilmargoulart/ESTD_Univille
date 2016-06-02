package prova;

import java.io.IOException;
import java.text.ParseException;
import org.junit.Assert;
import org.junit.Test;

public class Q3ValorMedioABCB4Test {

	@Test
	public void test() throws IOException, ParseException {
		
		Q3ValorMedioABCB4 q3ValorMedio = new Q3ValorMedioABCB4();
		
		double expected = 9.98;
		double media = q3ValorMedio.getValorMedioABCB4().doubleValue();
		
		//System.out.println(q3ValorMedio.getValorMedioABCB4());
		
		//Verificar se a média é o valor esperado
		Assert.assertEquals(expected, media, 2);
	}
}