package node;

public class DNode<T> {
	
	private T element;
	
	private DNode<T> next;
	private DNode<T> previous;
	
	public DNode<T> getPrevious() {
		return previous;
	}

	public void setPrevious(DNode<T> previous) {
		this.previous = previous;
	}

	public T getElement(){
		return this.element;
	}
	
	public void setElement(T element){
		this.element = element;
	}
	
	public DNode<T> getNext(){
		return this.next;
	}

	public void setNext(DNode<T> next){
		this.next = next;
	}
}