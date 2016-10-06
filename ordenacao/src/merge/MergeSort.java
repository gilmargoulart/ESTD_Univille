package merge;

public class MergeSort {
	
	private int n[];
	
	public MergeSort(int[] n){
		setN(n);
	}
	
	/**
	 * Ordenação utilizando MergeSort
	 * @return
	 */
	public int[] sort(){
		return sort(0, n.length - 1);
	}
	
	private int[] sort(int inicio, int fim){
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			sort(inicio, meio);
			sort(meio + 1, fim);
			mesclar(inicio, meio, fim);
		}
		
		return this.n;
	}
	
	private void mesclar(int inicio, int meio, int fim) {
		int tamanho = fim - inicio + 1;
		int[] temp = new int[tamanho];
		for (int posicao = 0; posicao < tamanho; posicao++) {
			temp[posicao] = this.n[inicio + posicao];
		}
		
		int i = 0;
		int j = meio - inicio + 1;
		for (int posicao = 0; posicao < tamanho; posicao++) {
			if (j <= tamanho - 1) {
				if ((i <= meio - inicio)) {
					if (temp[i] < temp[j]) {
						this.n[inicio + posicao] = temp[i++];
					} else {
						this.n[inicio + posicao] = temp[j++];
					}
				} else {
					this.n[inicio + posicao] = temp[j++];
				}
			} else {
				this.n[inicio + posicao] = temp[i++];
			}
		}
	}
	
	public int[] getN(){
		return this.n;
	}
	
	private void setN(int[] n){
		this.n = n;
	}
	
}
