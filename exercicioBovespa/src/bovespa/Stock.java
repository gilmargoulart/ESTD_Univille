package bovespa;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Stock {
	
	/*
	 	Date date; 03 10
		String code; 13 24
		BigDecimal openPrice; 57 69
		BigDecimal closePrice; 
		BigDecimal maxPrice; 70 82
		BigDecimal minPrice; 83 95
	*/
	
	private Date date;
	private String code;
	private BigDecimal openPrice;
	private BigDecimal closePrice;
	private BigDecimal maxPrice;
	private BigDecimal minPrice;
	
	public Stock(){
		
	}
	
	public Stock(Date date, String code, BigDecimal openPrice, BigDecimal closePrice, BigDecimal maxPrice, BigDecimal minPrice){
		setDate(date);
		setCode(code);
		setOpenPrice(openPrice);
		setClosePrice(closePrice);
		setMaxPrice(maxPrice);
		setMinPrice(minPrice);
	}
	
	public Stock(String strFileLine) throws ParseException{
		if (strFileLine.startsWith("01")){
			//Data: 3 - 10
			//For example, a time text "07/10/96 4:5 PM, PDT" will be parsed into a Date that is equivalent to Date(837039900000L). 
			String strDate = strFileLine.substring(2, 10).trim();
			strDate = strDate.substring(6, 8) + '-' + strDate.substring(4, 6) + '-' + strDate.substring(0, 4); 
			
			Date dt = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).parse(strDate);
			setDate(dt);
			
			//CODNEG - CÓDIGO DE NEGOCIAÇÃO DO PAPEL
			String code = strFileLine.substring(12, 24).trim();
			
			//PREABE - PREÇO DE ABERTURA DO PAPEL-MERCADO NO PREGÃO
			String strOpenPrice = strFileLine.substring(56, 69).trim();
			strOpenPrice = strOpenPrice.substring(0, 11) + '.' + strOpenPrice.substring(11, 13);
			BigDecimal openPrice = new BigDecimal(strOpenPrice);
			
			//PREMAX - PREÇO MÁXIMO DO PAPEL-MERCADO NO PREGÃO
			String strMaxPrice = strFileLine.substring(69, 82).trim();
			strMaxPrice = strMaxPrice.substring(0, 11) + '.' + strMaxPrice.substring(11, 13);
			BigDecimal maxPrice = new BigDecimal(strMaxPrice);
			
			
			//PREMIN - PREÇO MÍNIMO DO PAPELMERCADO NO PREGÃO
			String strMinPrice = strFileLine.substring(82, 95).trim();
			strMinPrice = strMinPrice.substring(0, 11) + '.' + strMinPrice.substring(11, 13);
			BigDecimal minPrice = new BigDecimal(strMinPrice);
			
			
			//Close Price
			String strClosePrice = strFileLine.substring(108, 121).trim();
			strClosePrice = strClosePrice.substring(0, 11) + '.' + strClosePrice.substring(11, 13);
			BigDecimal closePrice = new BigDecimal(strClosePrice);
			
			
			setCode(code);
			setOpenPrice(openPrice);
			setMaxPrice(maxPrice);
			setMinPrice(minPrice);
			setClosePrice(closePrice);
		}
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}


	public BigDecimal getOpenPrice() {
		return openPrice;
	}

	public void setOpenPrice(BigDecimal openPrice) {
		this.openPrice = openPrice;
	}


	public BigDecimal getClosePrice() {
		return closePrice;
	}

	public void setClosePrice(BigDecimal closePrice) {
		this.closePrice = closePrice;
	}


	public BigDecimal getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(BigDecimal maxPrice) {
		this.maxPrice = maxPrice;
	}


	public BigDecimal getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(BigDecimal minPrice) {
		this.minPrice = minPrice;
	}
	
	@Override
	public String toString() {
		String strRetorno;
		
		strRetorno = getCode() + ": Preço Inicial: " + getOpenPrice();
		
		return strRetorno;
	}
}