package prova;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import org.apache.commons.io.FileUtils;
import bovespa.Stock;
import node.SLinkedList;

public class Q4ListaVALE5_PETR4 {
	
	private SLinkedList<Stock> listaVALE5;
	private SLinkedList<Stock> listaPETR4;
	
	public Q4ListaVALE5_PETR4() throws ParseException, IOException{
		this.listaPETR4 = new SLinkedList<Stock>();
		this.listaVALE5 = new SLinkedList<Stock>();
		
		//Arquivo txt
		File f = new File("txt\\COTAHIST_A2016_large.txt");
		List<String> linhas = FileUtils.readLines(f, "UTF-8");
		
		for (String linha : linhas) {
			if (linha.startsWith("01")) {
				Stock stock = new Stock(linha);
				if (stock.getCode().equals("PETR4")) {
					this.listaPETR4.add(stock);
				} else if(stock.getCode().equals("VALE5")){
					this.listaVALE5.add(stock);
				}
			}
		}
	}

	public SLinkedList<Stock> getListaVALE5() {
		return this.listaVALE5;
	}

	public SLinkedList<Stock> getListaPETR4() {
		return this.listaPETR4;
	}
}