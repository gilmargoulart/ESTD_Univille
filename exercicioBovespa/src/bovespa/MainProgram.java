package bovespa;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class MainProgram {

	public static void main(String[] args) {
		
		//Arquivo txt
		File f = new File("txt\\COTAHIST_A2016_small.txt");
		
		try {
			List<String> linhas = FileUtils.readLines(f, "UTF-8");
			for (String linha : linhas) {
				//System.out.println(linha);
				
				if (linha.startsWith("01")) {
					
					/*
					 	Date date; 03 10
						String code; 13 24
						BigDecimal openPrice; 57 69
						BigDecimal closePrice; 
						BigDecimal maxPrice; 70 82
						BigDecimal minPrice; 83 95
					*/
					
					Stock stock = new Stock(linha);
					
					System.out.println("Date: " + stock.getDate());
					System.out.println("Code: " + stock.getCode());
					System.out.println("Open Price: " + stock.getOpenPrice());
					System.out.println("Close Price: " + stock.getClosePrice());
					System.out.println("Max. Price: " + stock.getMaxPrice());
					System.out.println("Min. Price: " + stock.getMinPrice());
					System.out.println("");
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}