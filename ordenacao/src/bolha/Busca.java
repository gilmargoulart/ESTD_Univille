package bolha;

public class Busca {
	
	/**
	 * Localiza valor no arranjo [n] e retorna a posição.
	 * @param n - Arranjo
	 * @param valor - Valor para busca
	 * @return Posição do valor
	 */
	public int find(int[] n, int valor){
		int retorno = -1;

		for (int i = 0; i < n.length; i++) {
			if (n[i] == valor) {
				retorno = i;
				break;
			}
		}
		
		return retorno;
	}
}