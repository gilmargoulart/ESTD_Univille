package estd;

/**
 * Dado um arranjo de inteiros n[], retornar verdadeiro quando o �ltimo e o primeiro elemento forem iguais.
 * @author gilmar.goulart
 *
 */
public class Q5RetornaSeExtremosIguais {
	
	private int[] numeros;

	public Q5RetornaSeExtremosIguais(int[] numeros){
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
	
	
	public boolean isExtremosIguais(){
		//Primeiro N�mero
		int primeiroNumero = getNumeros()[0];
		//�ltimo n�mero
		int ultimoNumero = getNumeros()[getNumeros().length - 1];
		
		//Retornar compara��o
		return (primeiroNumero == ultimoNumero);
	}
}
