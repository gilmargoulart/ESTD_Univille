package prova;

import org.junit.Assert;
import org.junit.Test;

import tree.TreeNode;

public class Questao3 {

	@Test
	public void testQuestao1() {
		
		TreeNode<String> treeNode1 = new TreeNode<String>("1");
		TreeNode<String> treeNode2 = new TreeNode<String>("2");
		TreeNode<String> treeNode3 = new TreeNode<String>("3");
		TreeNode<String> treeNode4 = new TreeNode<String>("4");
		TreeNode<String> treeNode5 = new TreeNode<String>("5");
		TreeNode<String> treeNode6 = new TreeNode<String>("6");
		TreeNode<String> treeNode7 = new TreeNode<String>("7");
		TreeNode<String> treeNode8 = new TreeNode<String>("8");
		
		treeNode1.addChild(treeNode2);
		treeNode1.addChild(treeNode3);
		treeNode1.addChild(treeNode4);
			treeNode4.addChild(treeNode5);
				treeNode5.addChild(treeNode8);
			treeNode4.addChild(treeNode6);
			treeNode4.addChild(treeNode7);
		
		treeNode1.print();
		
		Assert.assertTrue(treeNode1.isRoot());
		Assert.assertFalse(treeNode2.isRoot());
		Assert.assertFalse(treeNode3.isRoot());
		Assert.assertFalse(treeNode4.isRoot());
		Assert.assertFalse(treeNode5.isRoot());
		Assert.assertFalse(treeNode6.isRoot());
		Assert.assertFalse(treeNode7.isRoot());
		Assert.assertFalse(treeNode8.isRoot());
		
		Assert.assertFalse(treeNode1.isLeaf());
		Assert.assertTrue(treeNode2.isLeaf());
		Assert.assertTrue(treeNode3.isLeaf());
		Assert.assertFalse(treeNode4.isLeaf());
		Assert.assertFalse(treeNode5.isLeaf());
		Assert.assertTrue(treeNode6.isLeaf());
		Assert.assertTrue(treeNode7.isLeaf());
		Assert.assertTrue(treeNode8.isLeaf());
	}
	
}
