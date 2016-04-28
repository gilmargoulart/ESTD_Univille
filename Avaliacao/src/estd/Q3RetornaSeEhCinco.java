package estd;

/**
 * Dado um arranjo de inteiros n[], retornar verdadeiro quando o primeiro ou o último elemento do arranjo seja igual a 5
 * @author gilmar.goulart
 *
 */
public class Q3RetornaSeEhCinco {

	private int[] numeros;

	//Utilizar atributo com o numero a ser comparado, para evitar repetições.
	private int numComparacaoRetorno = 5;

	public Q3RetornaSeEhCinco(int[] numeros){
		setNumeros(numeros);
	}
	
	
	/**
	 * Retorna os números
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
	 * Retorna verdadeiro quando o primeiro ou último número é igual a cinco.
	 * @return isFive
	 */
	public boolean isFive(){
		//Primeiro Número
		int primeiroNumero = getNumeros()[0];
		//Último número
		int ultimoNumero = getNumeros()[getNumeros().length - 1];
		
		//Retorna resultado da comparação, ou seja, se o primeiro ou último número é igual a cinco.
		return  (primeiroNumero == this.numComparacaoRetorno) | (ultimoNumero == this.numComparacaoRetorno);
	}
}
