package bovespa;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.util.List;

import org.apache.commons.io.FileUtils;

import node.Node;
import node.SLinkedList;

public class MainProgram {

	public static void main(String[] args) throws ParseException {
		
		//Arquivo txt
		File f = new File("txt\\COTAHIST_A2016_large.txt");
		
		try {
			List<String> linhas = FileUtils.readLines(f, "UTF-8");
			SLinkedList<Stock> stocks = new SLinkedList<Stock>();
			
			for (String linha : linhas) {
				
				if (linha.startsWith("01")) {
					Stock stock = new Stock(linha);
					stocks.add(stock);
				}
			}
			
			//Pegar primeiro elemento
			Node<Stock> nodeStock = stocks.getFirst();
			Stock stock = nodeStock.getElement();
			
			BigDecimal maxPrice = new BigDecimal(0);
			BigDecimal avgPrice = new BigDecimal(0);
			BigDecimal minPrice = stock.getMinPrice();
			
			long qtd = 0;
			
			boolean finished = false;
			do {
				
				/*
				System.out.println("Date: " + stock.getDate());
				System.out.println("Code: " + stock.getCode());
				System.out.println("Open Price: " + stock.getOpenPrice());
				System.out.println("Close Price: " + stock.getClosePrice());
				System.out.println("Max. Price: " + stock.getMaxPrice());
				System.out.println("Min. Price: " + stock.getMinPrice());
				System.out.println("");
				*/
				if (stock.getCode().equalsIgnoreCase("PETR4")) {
					maxPrice = stock.getMaxPrice().max(maxPrice);
					minPrice = stock.getMinPrice().min(minPrice);
					
					avgPrice = avgPrice.add(stock.getClosePrice());
					qtd += 1;
				}
				
				
				
				if (nodeStock.getNext() != null) {
					nodeStock = nodeStock.getNext();
					stock = nodeStock.getElement(); 
				} else {
					finished = true;
				}
			} while (!finished);
			
			System.out.println("maxPrice: " + maxPrice);
			System.out.println("minPrice: " + minPrice);
			
			avgPrice = avgPrice.divide(new BigDecimal(qtd), 2, RoundingMode.HALF_EVEN);
			System.out.println("avgPrice: " + avgPrice);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}