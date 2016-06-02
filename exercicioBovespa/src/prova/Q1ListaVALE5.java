package prova;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import org.apache.commons.io.FileUtils;

import bovespa.Stock;
import node.SLinkedList;

/*
 * 1. Crie um algoritmo que fa�a leitura do arquivo de cota��es e retorne
 * uma lista contendo apenas as cota��es com c�digo VALE5.
 */
public class Q1ListaVALE5 {
	
	public SLinkedList<Stock> getListaVALE5(String code) throws IOException, ParseException{
		
		//Arquivo txt
		File f = new File("txt\\COTAHIST_A2016_large.txt");
		
		List<String> linhas = FileUtils.readLines(f, "UTF-8");
		SLinkedList<Stock> stocks = new SLinkedList<Stock>();
		
		for (String linha : linhas) {
			if (linha.startsWith("01")) {
				Stock stock = new Stock(linha);
				if (stock.getCode().equals(code)) {
					stocks.add(stock);
				}
			}
		}

		return stocks;
	}
}