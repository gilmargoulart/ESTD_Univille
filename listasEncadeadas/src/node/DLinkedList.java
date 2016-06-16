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
			DNode<T> next = first.getNext(); 
			
			//Define o primeiro elemento como sendo o segundo
			first = next;
			
			//Caso sobrar 1 elemento, remover a �ltima refer�ncia
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
	 * Remove o �ltimo elemento da lista
	 */
	public void removeLast(){
		//Somente remover o �ltimo elemento
		if (this.size > 0) {
			
			//Define o �ltimo elemento como sendo o anterior
			last = last.getPrevious();
			
			//Se houver apenas 1 elemento, ent�o n�o existe o anterior.
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