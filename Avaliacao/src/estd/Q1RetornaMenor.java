package estd;

/**
 * Fun��o que recebe um arranjo de inteiros n[] e retorna o menor entre eles
 * @author gilmar.goulart
 *
 */
public class Q1RetornaMenor {
	
	private int[] numeros;

	public Q1RetornaMenor(int[] numeros){
		setNumeros(numeros);
	}
	
	
	/**
	 * Retornar o menor n�mero
	 * @return
	 */
	public int getMenor(){
		//Inicializar com o primeiro n�mero do vetor.
		int menorNum = this.numeros[0];
		
		//Navegar nos n�meros
		for (int num : this.numeros) {
			//Comparar se o n�mero � menor que o "menor" atual.
			if (num < menorNum) {
				//Menor n�mero.
				menorNum = num;
			}
		}
		
		//Retornar o menor n�meo encontrado.
		return menorNum;
	}
	
	
	/**
	 * Definir numeros
	 * @param numeros
	 */
	private void setNumeros(int[] numeros) {
		this.numeros = numeros;
	}
	
	
	/**
	 * Retorna os n�meros
	 * @return
	 */
	public int[] getNumeros() {
		return numeros;
	}
}
