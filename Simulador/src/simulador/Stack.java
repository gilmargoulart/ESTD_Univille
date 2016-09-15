package simulador;

public class Stack<T> {
	
	/**
	 * Array
	 */
	private T[] array;
	
	/**
	 * Position
	 */
	private int position;
	
	/**
	 * Capacidade
	 */
	private int capacity;
	
	@SuppressWarnings("unchecked")
	public Stack(int capacity){
		this.capacity = capacity;
		array = (T[]) new Object[capacity];
		position = 0;
	}
	
	/**
	 * Adicionar elemento na pilha
	 * @param elemento
	 */
	@SuppressWarnings("unchecked")
	public void push(T e){
		//Verificar se o tamanho da pilha é o mesmo que o da capacidade
		if (getSize() == capacity) {
			//Dobrar a capacidade
			capacity *= 2;
			
			//Criar nova pilha
			T[] newArray = (T[]) new Object[capacity];
			
			System.arraycopy(array, 0, newArray, 0, array.length);
			
			array = newArray;
		}
		
		//Adicionar elemento no vetor
		array[position] = e;
		
		//Incrementar posição
		position++;
	}
	
	/**
	 * Remover elemento no topo da pilha e o retorna.
	 * @return elemento
	 */
	public T pop(){
		
		if (getSize() == 0){
			return null;
		}
		
		//Decrementar posição, já que removeu o último elemento.
		position--;
		
		//Último elemento da pilha.
		T ret = array[position];
		
		//Remover elemento da pilha.
		array[position] = null;
		
		//Retornar elemento.
		return ret;
	}
	
	/**
	 * retorna o elemento no topo da pilha, sem retirá-lo
	 * @return elemento
	 */
	public T top(){
		//Retorna último elemento da pilha
		if (isEmpty()){
			return null;
		}
		return array[position-1];
	}
	
	/**
	 * Retorna tamanho da pilha
	 * @return size
	 */
	public int getSize(){
		return position;
	}
	
	/**
	 * Retorna capacidade da pilha
	 * @return capacidade
	 */
	public int getCapacity(){
		return capacity;
	}
	
	/**
	 * Retorna true se a pilha está vazia.
	 * @return isEmpty
	 */
	public boolean isEmpty(){
		//Retorna resultado do teste
		return position == 0;
	}
	
	public T[] getArray(){
		return this.array;
	}
}
