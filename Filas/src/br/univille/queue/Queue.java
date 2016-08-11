package br.univille.queue;

import java.util.Arrays;

public class Queue<T> {
	
	/**
	 * Array
	 */
	private T[] array;
	
	private int last;
	
	private int first;
	
	/**
	 * Capacidade
	 */
	private int capacity;
	
	@SuppressWarnings("unchecked")
	public Queue(){
		capacity = 20;
		last = 0;
		first = 0;
		array = (T[]) new Object[capacity];
	}
	
	/**
	 * Adiciona elemento na fila.
	 * @param t
	 */
	public void enqueue(T t){
		array[last] = t;
		last++;
	}
	
	/**
	 * Retira elemento da lista e o retorna.
	 * @return e
	 */
	public T dequeue(){
		T temp = array[first];
		array[first] = null;
		first++;
		
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
		return (last - first);
	}
	
	/**
	 * Retornar elemento da vez na fila.
	 * @return e
	 */
	public T front(){
		return array[first];
	}
	
	@Override
	public String toString(){
		return Arrays.toString(array);
	}
}
