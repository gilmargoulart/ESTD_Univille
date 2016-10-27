package tree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode<T> {
	
	private TreeNode<T> parent;
	
	private T element;
	
	private List<TreeNode<T>> children = new ArrayList<TreeNode<T>>();

	public TreeNode(T element){
		setElement(element);
	}
	
	public boolean isRoot(){
		return (parent == null);
	}
	
	public boolean isLeaf(){
		return children.isEmpty();
	}
	
	public void print(){
		System.out.println(getElement());
		print(this, 1);
	}
	
	private void print(TreeNode<T> parent, int nivel){
		for (TreeNode<T> child : parent.getchildren()) {
			int qtdEspacos = (nivel*2) + child.toString().length();
			System.out.println(String.format("%" + qtdEspacos + "s", child.toString()));
			if (!child.isLeaf()) {
				print(child, nivel+1);
			}
		}
	}
	
	public void addChild(TreeNode<T> child){
		child.setParent(this);
		children.add(child);
	}
	
	public void addChild(T child){
		TreeNode<T> c = new TreeNode<T>(child);
		c.setParent(this);
		children.add(c);
	}
	
	public TreeNode<T> getParent() {
		return parent;
	}
	
	public void setParent(TreeNode<T> parent) {
		this.parent = parent;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public List<TreeNode<T>> getchildren() {
		return this.children;
	}

	public void setChilds(List<TreeNode<T>> childs) {
		this.children = childs;
	}
	
	@Override
	public String toString(){
		return element.toString();
	}
}