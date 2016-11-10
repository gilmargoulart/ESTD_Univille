package btree;

public class BTreeNode<T> {
	
	private BTreeNode<T> parent;
	
	private T element;
	
	private BTreeNode<T> leftChild;
	private BTreeNode<T> rightChild;
	

	public BTreeNode(T element){
		setElement(element);
	}
	
	public boolean isRoot(){
		return (parent == null);
	}
	
	public boolean isLeaf(){
		return (leftChild == null && rightChild == null);
	}
	
	public void print(){
		System.out.println(getElement());
		print(this, 1);
	}
	
	private void print(BTreeNode<T> parent, int nivel){
		if (parent.leftChild != null) {
			int qtdEspacos = (nivel*2) + parent.leftChild.toString().length();
			System.out.println(String.format("%" + qtdEspacos + "s", parent.leftChild.toString()));
			if (!parent.leftChild.isLeaf()) {
				print(parent.leftChild, nivel+1);
			}
		}
		
		if (parent.rightChild != null) {
			int qtdEspacos = (nivel*2) + parent.rightChild.toString().length();
			System.out.println(String.format("%" + qtdEspacos + "s", parent.rightChild.toString()));
			if (!parent.rightChild.isLeaf()) {
				print(parent.rightChild, nivel+1);
			}
		}
	}
	
	public BTreeNode<T> addLeftChild(BTreeNode<T> child){
		child.setParent(this);
		setLeftChild(child);
		return child;
	}
	
	public BTreeNode<T> addRightChild(BTreeNode<T> child){
		child.setParent(this);
		setRightChild(child);
		return child;
	}
	
	
	public BTreeNode<T> addLeftChild(T child){
		BTreeNode<T> c = new BTreeNode<T>(child);
		c.setParent(this);
		leftChild = c;
		return c;
	}
	
	public BTreeNode<T> addRightChild(T child){
		BTreeNode<T> c = new BTreeNode<T>(child);
		c.setParent(this);
		rightChild = c;
		return c;
	}
	
	public BTreeNode<T> getParent() {
		return parent;
	}
	
	public void setParent(BTreeNode<T> parent) {
		this.parent = parent;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public BTreeNode<T> getLeftChild() {
		return leftChild;
	}

	private void setLeftChild(BTreeNode<T> leftChild) {
		this.leftChild = leftChild;
	}

	public BTreeNode<T> getRightChild() {
		return rightChild;
	}

	private void setRightChild(BTreeNode<T> rightChild) {
		this.rightChild = rightChild;
	}

	@Override
	public String toString(){
		return element.toString();
	}
}