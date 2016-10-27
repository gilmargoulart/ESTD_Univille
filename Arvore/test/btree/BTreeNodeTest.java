package btree;

import org.junit.Assert;
import org.junit.Test;

public class BTreeNodeTest {

	@Test
	public void test() {
		
		BTreeNode<String> pai = new BTreeNode<String>("Phai");
		
		Assert.assertTrue(pai.isLeaf());
		Assert.assertTrue(pai.isRoot());
		
		pai.addLeftChild("Filho 1 Left");
		Assert.assertFalse(pai.isLeaf());
		Assert.assertTrue(pai.getLeftChild().isLeaf());
		
		pai.addRightChild("Filho 1 Right");
		Assert.assertFalse(pai.isLeaf());
		Assert.assertTrue(pai.getRightChild().isLeaf());
		
		pai.getLeftChild().addLeftChild("Filho Left do Filho 1 Left");
			pai.getLeftChild().getLeftChild().addLeftChild("Filho Left");
			pai.getLeftChild().getLeftChild().addRightChild("Filho Right");
			
		pai.getLeftChild().addRightChild("Filho Right do Filho 1 Left");
			pai.getLeftChild().getRightChild().addLeftChild("Filho Left");
			pai.getLeftChild().getRightChild().addRightChild("Filho Right");
		
		pai.getRightChild().addLeftChild("Filho Left do Filho 1 Right");
		pai.getRightChild().addRightChild("Filho Right do Filho 1 Right");
		
		pai.print();
	}
}