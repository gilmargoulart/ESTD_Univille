package node;

public class Node<T> {
	
	private T element;
	
	private Node<T> next;
	
	public T getElement(){
		return this.element;
	}
	
	public void setElement(T element){
		this.element = element;
	}
	
	public Node<T> getNext(){
		return this.next;
	}

	public void setNext(Node<T> next){
		this.next = next;
	}
}