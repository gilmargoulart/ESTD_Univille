package bovespa;

import java.math.BigDecimal;
import java.util.Date;

public class Stock {
	
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
	
	public Stock(String strFileLine){
		//Data: 3 - 10
		String date = strFileLine.substring(2, 10).trim();
		
		//CODNEG - C�DIGO DE NEGOCIA��O DO PAPEL
		String code = strFileLine.substring(12, 24).trim();
		
		//PREABE - PRE�O DE ABERTURA DO PAPEL-MERCADO NO PREG�O
		String strOpenPrice = strFileLine.substring(56, 70).trim();
		strOpenPrice = strOpenPrice.substring(0, 11) + "." + strOpenPrice.substring(12, 13);
		
		//PREMAX - PRE�O M�XIMO DO PAPEL-MERCADO NO PREG�O
		String strMaxPrice = strFileLine.substring(69, 82).trim();
		
		//PREMIN - PRE�O M�NIMO DO PAPELMERCADO NO PREG�O
		String strMinPrice = strFileLine.substring(83, 96).trim();
		
		//Close Price
		//String strClosePrice = linha.substring(, ).trim();
		
		setCode(code);
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
		
		strRetorno = getCode() + ": Pre�o Inicial: " + getOpenPrice();
		
		return strRetorno;
	}
}