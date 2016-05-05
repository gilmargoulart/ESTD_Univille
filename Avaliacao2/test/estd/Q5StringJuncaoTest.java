package estd;

import org.junit.Assert;
import org.junit.Test;

public class Q5StringJuncaoTest {

	@Test
	public void juncaoStringTest(){
		
		String str1 = "ola";
		String str2 = "pedro";
		String strEsperada = "ola pedro";
		
		Q5StringJuncao q5StrJuncao = new Q5StringJuncao(str1, str2);
		Assert.assertEquals(strEsperada, q5StrJuncao.getJuncaoString());
		
		
		//Outro teste
		str1 = "alo";
		str2 = "mundo";
		strEsperada = "alo mundo";
		
		q5StrJuncao = new Q5StringJuncao(str1, str2);
		Assert.assertEquals(strEsperada, q5StrJuncao.getJuncaoString());
		
	}
}