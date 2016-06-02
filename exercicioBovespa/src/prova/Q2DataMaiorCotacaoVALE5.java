package prova;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import bovespa.Stock;
import node.Node;
import node.SLinkedList;

/*
 * 1. Crie um algoritmo que faça leitura do arquivo de cotações e retorne
 * uma lista contendo apenas as cotações com código VALE5.
 */
public class Q2DataMaiorCotacaoVALE5 {
	
	public Date getDataMaiorCotacaoVALE5() throws IOException, ParseException{
		
		Date dataMaiorCotacao = null;
		BigDecimal maiorCotacao = new BigDecimal(0);
		
		//Ler lista com códigos VALE5
		Q1ListaVALE5 q1ListaVale5 = new Q1ListaVALE5();
		SLinkedList<Stock> listaVale5 = q1ListaVale5.getListaVALE5("VALE5");
		
		//Pegar primeiro elemento
		Node<Stock> nodeStock = listaVale5.getFirst();
		Stock stock = nodeStock.getElement();
		
		//Navegar na lista
		boolean finished = false;
		do {
			if (maiorCotacao.compareTo(stock.getClosePrice()) == -1){
				//Recebe o maior valor
				maiorCotacao = maiorCotacao.max(stock.getClosePrice());
				dataMaiorCotacao = stock.getDate();
			}
			
			if (nodeStock.getNext() != null) {
				nodeStock = nodeStock.getNext();
				stock = nodeStock.getElement(); 
			} else {
				finished = true;
			}
		} while (!finished);

		return dataMaiorCotacao;
	}
}