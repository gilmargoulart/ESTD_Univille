package bolha;

/**
 * 
 *
 */
public class Bolha {
	
	private int n[];
	
	public Bolha(int[] n){
		this.n = n;
	}
	
	public int[] getN(){
		return this.n;
	}
	
	/**
	 * Ordena vetor n[] de forma ascendente
	 * @param n
	 * @return n[]
	 */
	public int[] orderAsc(){
		
		int nOld;
		for (int i = 0; i < n.length - 1; i++) {
			
			//Começar no próximo elemento...
			for (int j = i+1; j < n.length; j++) {
				
				//Verificar se o número da próxima posição é menor que o anterior. 
				if (n[j] < n[i]) {
					//Guardar valor de n[j]...
					nOld = n[j];
					
					//Trocar valor de n[j] pelo valor de n[i]...
					n[j] = n[i];
					
					//Trocar valor de n[i] pelo valor de [j], que está em nOld...
					n[i] = nOld;
				}
			}
		}
		
		//Retorna n ordenado
		return n;
	}
	
	/**
	 * Ordena vetor n[] de forma descendente
	 * @param n
	 * @return n[]
	 */
	public int[] orderDesc(){
		
		int nOld;
		for (int i = 0; i < n.length - 1; i++) {
			
			//Começar no próximo elemento...
			for (int j = i+1; j < n.length; j++) {
				
				//Verificar se o número da próxima posição é menor que o anterior. 
				if (n[j] > n[i]) {
					//Guardar valor de n[j]...
					nOld = n[j];
					
					//Trocar valor de n[j] pelo valor de n[i]...
					n[j] = n[i];
					
					//Trocar valor de n[i] pelo valor de [j], que está em nOld...
					n[i] = nOld;
				}
			}
		}
		
		//Retorna n ordenado
		return n;
	}

}