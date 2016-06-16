package node;

public class DLinkedList<T> {
	
	private DNode<T> first;
	private DNode<T> last;
	
	private long size;
	
	
	public void add(T element){
		if (size == 0) {
			first = new DNode<T>();
			first.setElement(element);
			first.setNext(null);
			first.setPrevious(null);
			last = first;
		} else {
			//Cria novo objeto
			DNode<T> node = new DNode<T>();
			
			//Definir que o elemento anterior
			node.setPrevious(last);
			
			//Informar que o próximo node é o recém criado
			last.setNext(node);
			
			//Atribui ao último node o node recém criado
			last = node;
			
			//Atribui o elemento ao node
			node.setElement(element);
			
			//Informar que o próximo é nulo
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
			DNode<T> next = first.getNext(); 
			
			//Define o primeiro elemento como sendo o segundo
			first = next;
			
			//Caso sobrar 1 elemento, remover a última referência
			if (this.size == 1) {
				last = null;
			} else {
				first.setPrevious(null);
			}
			
			//Decrementa o tamanho da lista
			this.size--;
		}
	}
	
	/**
	 * Remove o último elemento da lista
	 */
	public void removeLast(){
		//Somente remover o último elemento
		if (this.size > 0) {
			
			//Define o último elemento como sendo o anterior
			last = last.getPrevious();
			
			//Se houver apenas 1 elemento, então não existe o anterior.
			if (size == 1) {
				first = null;
			}
			
			//Decrementa o tamanho da lista
			this.size--;
		}
	}
	
	public DNode<T> getFirst() {
		return first;
	}

	public void setFirst(DNode<T> first) {
		this.first = first;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public void setLast(DNode<T> last) {
		this.last = last;
	}

	public DNode<T> getLast() {
		return last;
	}
	
}