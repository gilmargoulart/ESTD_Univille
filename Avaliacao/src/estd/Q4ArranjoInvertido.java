package estd;

/**
 * Dado um arranjo de inteiros n[], retornar um novo arranjo com os elementos em ordem invertida
 * @author gilmar.goulart
 *
 */
public class Q4ArranjoInvertido {

	private int[] numeros;

	public Q4ArranjoInvertido(int[] numeros){
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
	 * Retorna arranjo de numeros em ordem invertida
	 * @return numerosInvert
	 */
	public int[] getNumerosOrdemInvertida(){
		
		//Índice para controlar posições no novo arranjo
		int i = getNumeros().length;

		//Inicializar novo arranjo de mesmo tamanho
		int[] newNumeros = new int[i];
		
		//Navegar nos numeros, armazenando-os de forma invertida no novo arranjo
		for (int n : getNumeros()) {
			//Decrementar primeiro...
			i--;
			newNumeros[i] = n;
		}
		
		//Retornar arranjo em ordem invertida
		return newNumeros;
	}
}
