package estd;

/**
 * Dado um arranjo de inteiros n[], retornar verdadeiro quando o último e o primeiro elemento forem iguais.
 * @author gilmar.goulart
 *
 */
public class Q5RetornaSeExtremosIguais {
	
	private int[] numeros;

	public Q5RetornaSeExtremosIguais(int[] numeros){
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
	
	
	public boolean isExtremosIguais(){
		//Primeiro Número
		int primeiroNumero = getNumeros()[0];
		//Último número
		int ultimoNumero = getNumeros()[getNumeros().length - 1];
		
		//Retornar comparação
		return (primeiroNumero == ultimoNumero);
	}
}
