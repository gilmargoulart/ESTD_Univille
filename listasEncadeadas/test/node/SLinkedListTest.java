package node;

import org.junit.Assert;
import org.junit.Test;

public class SLinkedListTest {
	
	@Test
	public void testLinkedList(){
		
		SLinkedList<String> linkedList = new SLinkedList<String>();
		
		//Verificar se tamanho
		Assert.assertEquals(0, linkedList.getSize());
		
		//Adicionar 3 elementos
		linkedList.add("Gilmar");
		linkedList.add("Gilmar2");
		linkedList.add("Gilmar3");
		
		
		//Verificar se tem 3 elementos, e os respectivos primeiro e ultimo
		Assert.assertEquals(3, linkedList.getSize());
		Assert.assertEquals("Gilmar", linkedList.getFirst().getElement());
		Assert.assertEquals("Gilmar3", linkedList.getLast().getElement());
		
		
		//Remover 1� elemento
		linkedList.removeFirst();
		//Verificar tamanho
		Assert.assertEquals(2, linkedList.getSize());
		//Verificar primeiro elemento
		Assert.assertEquals("Gilmar2", linkedList.getFirst().getElement());
		//Verificar segundo elemento
		Assert.assertEquals("Gilmar3", linkedList.getLast().getElement());
		
		
		//Remover elemento
		linkedList.removeFirst();
		//Verificar tamanho
		Assert.assertEquals(1, linkedList.getSize());
		//Verificar o primeiro elemento
		Assert.assertEquals("Gilmar3", linkedList.getFirst().getElement());
		//Verificar �ltimo elemento
		Assert.assertEquals("Gilmar3", linkedList.getLast().getElement());
		
		
		//Remover primeiro elemento
		linkedList.removeFirst();
		//Verificar tamanho
		Assert.assertEquals(0, linkedList.getSize());
		//Verificar primeiro elemtnto
		Assert.assertEquals(null, linkedList.getFirst());
		//Verificar �ltimo elemento
		Assert.assertEquals(null, linkedList.getLast());
	}
}