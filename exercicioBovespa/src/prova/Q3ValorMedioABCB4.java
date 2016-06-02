package prova;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;

import bovespa.Stock;
import node.Node;
import node.SLinkedList;

/*
 * 3. Crie um algoritmo que retorne o valor médio da ação ABCB4
 * (basear a média no preço de fechamento - closePrice).
 * Valor médio tem que ser confirmado no teste unitário.
 */
public class Q3ValorMedioABCB4 {

	public BigDecimal getValorMedioABCB4() throws IOException, ParseException{
		BigDecimal media = new BigDecimal(0);
		int i = 0;
		
		//Ler lista com códigos VALE5
		Q1ListaVALE5 q1ListaVale5 = new Q1ListaVALE5();
		SLinkedList<Stock> listaVale5 = q1ListaVale5.getListaVALE5("ABCB4");
		
		//Pegar primeiro elemento
		Node<Stock> nodeStock = listaVale5.getFirst();
		Stock stock = nodeStock.getElement();
		
		//Navegar na lista
		boolean finished = false;
		do {
			
			media = media.add(stock.getClosePrice());
			i++;
			
			if (nodeStock.getNext() != null) {
				nodeStock = nodeStock.getNext();
				stock = nodeStock.getElement(); 
			} else {
				finished = true;
			}
		} while (!finished);
		
		media = media.divide(new BigDecimal(i), 2, RoundingMode.HALF_EVEN);
		
		return media;
	}
}
