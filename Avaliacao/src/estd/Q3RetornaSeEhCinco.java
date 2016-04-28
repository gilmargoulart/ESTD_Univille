package estd;

/**
 * Dado um arranjo de inteiros n[], retornar verdadeiro quando o primeiro ou o �ltimo elemento do arranjo seja igual a 5
 * @author gilmar.goulart
 *
 */
public class Q3RetornaSeEhCinco {

	private int[] numeros;

	//Utilizar atributo com o numero a ser comparado, para evitar repeti��es.
	private int numComparacaoRetorno = 5;

	public Q3RetornaSeEhCinco(int[] numeros){
		setNumeros(numeros);
	}
	
	
	/**
	 * Retorna os n�meros
	 * @return
	 */
	public int[] getNumeros() {
		return numeros;
	}
	
	
	/**
	 * Definir numeros
	 * @param numeros
	 */
	private void setNumeros(int[] numeros) {
		this.numeros = numeros;
	}
	
	
	/**
	 * Retorna verdadeiro quando o primeiro ou �ltimo n�mero � igual a cinco.
	 * @return isFive
	 */
	public boolean isFive(){
		//Primeiro N�mero
		int primeiroNumero = getNumeros()[0];
		//�ltimo n�mero
		int ultimoNumero = getNumeros()[getNumeros().length - 1];
		
		//Retorna resultado da compara��o, ou seja, se o primeiro ou �ltimo n�mero � igual a cinco.
		return  (primeiroNumero == this.numComparacaoRetorno) | (ultimoNumero == this.numComparacaoRetorno);
	}
}
