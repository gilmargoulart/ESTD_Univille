package prova;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.text.ParseException;
import org.junit.Test;
import bovespa.Stock;
import node.Node;
import node.SLinkedList;

public class Q4ListaVALE5_PETR4Test {

	@Test
	public void test() throws ParseException, IOException {
		
		Q4ListaVALE5_PETR4 q4Listas = new Q4ListaVALE5_PETR4();
		
		//Retorna lista da PERT4
		SLinkedList<Stock> listaPETR4 = q4Listas.getListaPETR4();
		//Retorna lista da VALE5
		SLinkedList<Stock> listaVALE5 = q4Listas.getListaVALE5();
		
		
		//Pegar primeiro elemento da lista PETR4
		Node<Stock> nodeStock = listaPETR4.getFirst();
		Stock stock = nodeStock.getElement();
		
		//Navegar na lista PETR4
		boolean finished = false;
		do {
			
			//Verificar se tem algum código diferente de VALE5
			if (!stock.getCode().equals("PETR4")) {
				fail("Encontrado código diferente de PETR4");
			}
			
			if (nodeStock.getNext() != null) {
				nodeStock = nodeStock.getNext();
				stock = nodeStock.getElement(); 
			} else {
				finished = true;
			}
		} while (!finished);
		
		
		//Pegar primeiro elemento da lista VALE5
		nodeStock = listaVALE5.getFirst();
		stock = nodeStock.getElement();
		
		//Navegar na lista VALE5
		finished = false;
		do {
			//Verificar se tem algum código diferente de VALE5
			if (!stock.getCode().equals("VALE5")) {
				fail("Encontrado código diferente de VALE5");
			}
			
			if (nodeStock.getNext() != null) {
				nodeStock = nodeStock.getNext();
				stock = nodeStock.getElement(); 
			} else {
				finished = true;
			}
		} while (!finished);
	}
}