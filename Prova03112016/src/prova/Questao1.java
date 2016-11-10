package prova;

import tree.TreeNode;

public class Questao1 extends TreeNode<String> {
	
	public Questao1(String element) {
		super(element);
		
		TreeNode<String> treeNode2 = new TreeNode<String>("2");
		TreeNode<String> treeNode3 = new TreeNode<String>("3");
		TreeNode<String> treeNode4 = new TreeNode<String>("4");
		TreeNode<String> treeNode5 = new TreeNode<String>("5");
		TreeNode<String> treeNode6 = new TreeNode<String>("6");
		TreeNode<String> treeNode7 = new TreeNode<String>("7");
		TreeNode<String> treeNode8 = new TreeNode<String>("8");
		
		this.addChild(treeNode2);
		this.addChild(treeNode3);
		this.addChild(treeNode4);
			treeNode4.addChild(treeNode5);
				treeNode5.addChild(treeNode8);
			treeNode4.addChild(treeNode6);
			treeNode4.addChild(treeNode7);
	}
}
