package prova;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.junit.Assert;
import org.junit.Test;

public class Q2DataMaiorCotacaoVALE5Test {

	@Test
	public void test() throws IOException, ParseException {
		
		Q2DataMaiorCotacaoVALE5 cotacaoVALE5 = new Q2DataMaiorCotacaoVALE5();
		
		Date expectedDate = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).parse("20-04-2016");
		Date dataMaiorCotacao = cotacaoVALE5.getDataMaiorCotacaoVALE5();
		
		//System.out.println(dataMaiorCotacao);
		//System.out.println(expectedDate);
		
		Assert.assertEquals(expectedDate, dataMaiorCotacao);
		
	}

}
