package estd;

/**
 * Dado número inteiro, retornar a soma de todos os números maiores que zero e menores que n
 * @author gilmar.goulart
 *
 */
public class Q2RetornaSoma {
	
	private int numero;
	
	public Q2RetornaSoma(int numero){
		setNumero(numero);
	}
	
	
	/**
	 * Retorna numero
	 * @return numero
	 */
	public int getNumero() {
		return this.numero;
	}
	
	
	/**
	 * Define numero
	 * @param numero
	 */
	private void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	/**
	 * Retorna a soma de todos os números menores que n, e maiores que zero.
	 * @return soma
	 */
	public int getSoma(){
		//Inicializar
		int soma = 0;
		
		for (int i = 1; i < getNumero(); i++) {
			//Somar
			soma += i;
		}
		
		//Retornar soma
		return soma;
	}
	
}
