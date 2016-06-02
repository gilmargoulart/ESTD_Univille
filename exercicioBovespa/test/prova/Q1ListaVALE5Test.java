package prova;

import static org.junit.Assert.*;

import java.io.IOException;
import java.text.ParseException;

import org.junit.Assert;
import org.junit.Test;

import bovespa.Stock;
import node.Node;
import node.SLinkedList;

public class Q1ListaVALE5Test {

	@Test
	public void test() throws IOException, ParseException {
		
		Q1ListaVALE5 q1ListaVale5 = new Q1ListaVALE5();
		SLinkedList<Stock> listaVale5 = q1ListaVale5.getListaVALE5("VALE5");
		
		//Verificar se tem somente 88 elementos
		Assert.assertEquals(88, listaVale5.getSize());
		
		//Pegar primeiro elemento
		Node<Stock> nodeStock = listaVale5.getFirst();
		Stock stock = nodeStock.getElement();
		
		//Navegar na lista
		boolean finished = false;
		do {
			
			//Verificar se tem algum código diferente de VALE5
			//No arquivo tem códigos VALE5F e VALE5T, que se considerar são 761 códigos 
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
