package estd;

import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {
	
	
	@Test
	public void reverseString(){
		
		//Definir um texto para efetuar o teste.
		String text = "Texto Teste...";
		//Definir o texto inverso a partir do texto anterior, para validar nos testes.
		String reverseText = "...etseT otxeT";
		
		//Instanciar classe ReverseString.
		ReverseString r = new ReverseString(text);
		
		//O texto ainda deve permanecer o mesmo
		Assert.assertEquals(r.getText(), text);
		Assert.assertNotEquals(r.getText(), reverseText);
		
		//Inverter o texto
		r.reverse();
		
		//O texto deve estar invertido.
		Assert.assertEquals(r.getText(), reverseText);
		Assert.assertNotEquals(r.getText(), text);
	}
	
}
