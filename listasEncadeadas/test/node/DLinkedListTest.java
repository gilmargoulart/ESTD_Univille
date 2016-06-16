package node;

import org.junit.Assert;
import org.junit.Test;

public class DLinkedListTest {
	
	@Test
	public void testLinkedList(){
		
		DLinkedList<String> linkedList = new DLinkedList<String>();
		
		//Verificar se tamanho
		Assert.assertEquals(0, linkedList.getSize());
		
		//Adicionar 3 elementos
		linkedList.add("Gilmar");
		linkedList.add("Gilmar2");
		
		
		//Testar elemento anterior, em relação ao Gilmar2
		Assert.assertEquals("Gilmar", linkedList.getLast().getPrevious().getElement());
		
		//Adicionad mais um elemento
		linkedList.add("Gilmar3");
		
		
		//Verificar se tem 3 elementos, e os respectivos primeiro e ultimo
		Assert.assertEquals(3, linkedList.getSize());
		Assert.assertEquals("Gilmar", linkedList.getFirst().getElement());
		Assert.assertEquals("Gilmar3", linkedList.getLast().getElement());
		/*
		 * Gilmar
		 * Gilmar2
		 * Gilmar3
		 */
		
		//Testar elemento anterior, em relação ao Gilmar3
		Assert.assertEquals("Gilmar2", linkedList.getLast().getPrevious().getElement());
		
		
		//Remover último elemento
		linkedList.removeLast();
		//Verificar tamanho
		Assert.assertEquals(2, linkedList.getSize());
		//Verificar último elemento
		Assert.assertEquals("Gilmar2", linkedList.getLast().getElement());

		//Testar elemento anterior, em relação ao Gilmar2
		Assert.assertEquals("Gilmar", linkedList.getLast().getPrevious().getElement());
		
		
		//Remover elemento
		linkedList.removeLast();
		//Verificar tamanho
		Assert.assertEquals(1, linkedList.getSize());
		//Verificar o primeiro elemento
		Assert.assertEquals("Gilmar", linkedList.getLast().getElement());
		
		//Testar elemento anterior, em relação ao Gilmar3
		Assert.assertEquals(null, linkedList.getLast().getPrevious());
				
		
		//Remover primeiro elemento
		linkedList.removeLast();
		//Verificar tamanho
		Assert.assertEquals(0, linkedList.getSize());

		//Verificar primeiro elemento
		Assert.assertEquals(null, linkedList.getFirst());
		//Verificar último elemento
		Assert.assertEquals(null, linkedList.getLast());
	}
}