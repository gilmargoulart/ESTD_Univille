package exercicios;

import org.junit.Assert;
import org.junit.Test;

public class Ex1AnagramaTest {
	
	@Test
	public void testeAnagrama(){
		
		//Definir palavra 1
		String str1 = "Gato";
		//Definir palavra 2
		String str2 = "Toga";
		
		//
		Ex1Anagrama anagrama = new Ex1Anagrama(str1, str2);
		
		//Verificar se as duas Strings s�o anagrama
		Assert.assertTrue(anagrama.isAnagrama()); //True
		
		//Ajustar outro teste, a fim de validar um teste "falso"
		str1 = "Gato";
		str2 = "Uhulll";
		
		anagrama = new Ex1Anagrama(str1, str2);
		
		//Verificar seas duas strings sao anagrama
		Assert.assertFalse(anagrama.isAnagrama()); //False
	}
}