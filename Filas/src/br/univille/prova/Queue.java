package br.univille.prova;

import java.util.Arrays;

public class Queue<T> {

	private T[] array;

	private int last = 0;

	private int first = 0;

	private int size = 0;
	
	private int capacity;
	
	@SuppressWarnings("unchecked")
	public Queue(int capacity) {
		this.capacity = capacity;
		array = (T[]) new Object[capacity];
	}
	
	public void enqueue(T t) {
		if (size == capacity) {
			int oldCapacity = capacity;
			int newCapacity = capacity * 2;
			
			@SuppressWarnings("unchecked")
			T[] newArray = (T[]) new Object[newCapacity];
			
			for (int i = 0; i < oldCapacity; i++) {
				newArray[i] = dequeue();
			}
			
			first = 0;
			last = oldCapacity;
			capacity = newCapacity;
			array = newArray;
			size = oldCapacity;
		}
		
		if (last < capacity) {
			array[last] = t;
			last++;
			size++;
		} else {
			last = 0;
			array[last] = t;
			last++;
			size++;
		}
		
	}

	public T dequeue() {
		
		T temp;
		if (size == 0) {
			return null;
		}else if (first < capacity) {
			temp = array[first];
			array[first] = null;
			first++;
			size--;
		} else {
			first = 0;
			temp = array[first];
			array[first] = null;
			first++;
			size--;
		}
		
		return temp;
	}

	public T front() {
		return array[first];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size() == 0;
	}
	
	@Override
	public String toString() {
		return "size: " + size + " first: " + first + " last: "  + last + Arrays.toString(array);
	}
}
