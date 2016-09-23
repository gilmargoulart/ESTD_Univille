package prova;

public class Q1RetornaPares {
	
	private int[] numeros;
	private Queue<Integer> queue;
	
	public Q1RetornaPares(int[] n){
		//Inicializar Fila com mesmo tamanho do vetor
		queue = new Queue<>(n.length);
		
		//Inicializar vetor
		setNumeros(n);
	}
	
	/**
	 * Retorna uma fila contendo apenas números pares
	 * @return Queue
	 */
	public Queue<Integer> retornaPares(){
		
		for (int i : numeros) {
			//Verificar se o resto da divisão é zero
			if (i % 2 ==0) {
				//par
				//Adicionar na fila
				queue.enqueue(i);
			}
		}
		
		//Retornar a fila
		return this.queue;
	}

	private void setNumeros(int[] numeros) {
		this.numeros = numeros;
	}
}