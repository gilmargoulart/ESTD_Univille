package estd;

/**
 * 2. Escreva uma pequena função em Java que receba um inteiro n e retorne a soma de todos os inteiros menores que n.
 * @author gilmar.goulart
 *
 */
public class IntSum {
	
	private int number;
	
	public IntSum(int number){
		setNumber(number);
	}
	
	
	/**
	 * Retorna a soma de todos os inteiros menores que o número informado.
	 * @return
	 */
	public int getSum(){
		int intReturn = 0;
		
		for (int i = 1; i < getNumber(); i++) {
			//Somar os números inteiros menores que o numero informado
			intReturn += i;
		}
		
		return intReturn;
	}
	
	
	/**
	 * Retorna o atributo number.
	 * @return
	 */
	public int getNumber() {
		return number;
	}

	
	/**
	 * Define o atributo number.
	 * @param number
	 */
	public void setNumber(int number) {
		this.number = number;
	}
}