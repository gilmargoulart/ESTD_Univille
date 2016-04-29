package node;

public class SLinkedList<T> {
	
	private Node<T> first;
	private Node<T> last;
	
	private long size;
	
	
	public void add(T element){
		if (size == 0) {
			first = new Node<T>();
			first.setElement(element);
			first.setNext(null);
			last = first;
		} else {
			//Cria novo objeto
			Node<T> node = new Node<T>();
			
			//Informar que o pr�ximo node � o rec�m criado
			last.setNext(node);
			
			//Atribui ao �ltimo node o node rec�m criado
			last = node;
			
			//Atribui o elemento ao node
			node.setElement(element);
			
			//Informar que o pr�ximo � nulo
			last.setNext(null);
		}
		size++;
	}
	
	/**
	 * Remove o primeiro elemento da lista
	 */
	public void removeFirst(){
		//Somente remover o primeiro elemento
		if (this.size > 0) {
			//Instancia novo node, para armazenar o segundo elemento
			Node<T> next = first.getNext(); 
			
			//Define o primeiro elemento como sendo o segundo
			first = next;
			
			//Caso sobrar 1 elemento, remover a �ltima refer�ncia
			if (this.size == 1) {
				last = null;
			}
			
			//Decrementa o tamanho da lista
			this.size--;
		}
	}
	
	public Node<T> getFirst() {
		return first;
	}

	public void setFirst(Node<T> first) {
		this.first = first;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public void setLast(Node<T> last) {
		this.last = last;
	}

	public Node<T> getLast() {
		return last;
	}
	
}