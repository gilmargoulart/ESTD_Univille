package estd;

/**
 * Função que recebe um arranjo de inteiros n[] e retorna o menor entre eles
 * @author gilmar.goulart
 *
 */
public class Q1RetornaMenor {
	
	private int[] numeros;

	public Q1RetornaMenor(int[] numeros){
		setNumeros(numeros);
	}
	
	
	/**
	 * Retornar o menor número
	 * @return
	 */
	public int getMenor(){
		//Inicializar com o primeiro número do vetor.
		int menorNum = this.numeros[0];
		
		//Navegar nos números
		for (int num : this.numeros) {
			//Comparar se o número é menor que o "menor" atual.
			if (num < menorNum) {
				//Menor número.
				menorNum = num;
			}
		}
		
		//Retornar o menor númeo encontrado.
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
	 * Retorna os números
	 * @return
	 */
	public int[] getNumeros() {
		return numeros;
	}
}
