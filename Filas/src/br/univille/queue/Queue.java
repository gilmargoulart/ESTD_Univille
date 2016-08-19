package br.univille.queue;

import java.util.Arrays;

public class Queue<T> {
	
	/**
	 * Array
	 */
	private T[] array;
	
	private int last;
	
	private int first;
	
	private int size;
	/**
	 * Capacidade
	 */
	private int capacity;
	
	@SuppressWarnings("unchecked")
	public Queue(){
		capacity = 20;
		last = 0;
		first = 0;
		size = 0;
		array = (T[]) new Object[capacity];
	}
	
	@SuppressWarnings("unchecked")
	public Queue(int capacity){
		this.capacity = capacity;
		last = 0;
		first = 0;
		array = (T[]) new Object[capacity];
	}
	
	/**
	 * Adiciona elemento na fila.
	 * @param t
	 */
	public void enqueue(T t){
		
		//Verifica p/ dobrar capacidade
		if (size == capacity) {
			int oldCap = capacity;
			int newCap = capacity * 2;
			last = oldCap;
			
			//Criar nova pilha
			T[] newArray = (T[]) new Object[newCap];
			
			//System.arraycopy(array, 0, newArray, 0, array.length);
			//Reorganizar array
			for (int i = 0; i < oldCap; i++) {
				newArray[i] = dequeue();
			}
			
			//Reorganizar índices
			first = 0;
			last = oldCap;
			capacity = newCap;
			size = oldCap;
			
			//Novo array
			array = newArray;
		}
		
		//Verificar se a fila está cheia
		if (last >= capacity) {
			last = 0;
		}
		
		array[last] = t;
		last++;
		size++;
		
	}
	
	/**
	 * Retira elemento da lista e o retorna.
	 * @return e
	 */
	public T dequeue(){
		
		T temp = null;
		
		//Verificar se a fila está cheia
		if(first >= capacity){
			first = 0;
			temp = array[first]; 
		}
		array[first] = null;
		
		first++;
		size--;
		
		return temp;
	}
	
	/**
	 * Retorna true se a fila estiver vazia.
	 * @return isEmpty
	 */
	public boolean isEmpty(){
		//Retorna resultado do teste
		return (last == first);
	}
	
	/**
	 * Retorna o tamanho da fila.
	 * @return
	 */
	public int getSize(){
		return size;
	}

	/**
	 * Retornar elemento da vez na fila.
	 * @return e
	 */
	public T front(){
		return array[first];
	}
	public int getCapacity(){
		return this.capacity;
	}
	
	@Override
	public String toString(){
		String ret = "size: " + size + ", first: " + first + ", last: " + last;
		ret += "\n" + Arrays.toString(array);
		return ret;
	}
}
