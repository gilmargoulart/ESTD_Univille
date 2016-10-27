package tree;

import org.junit.Test;

public class TreeNodeTest {

	@Test
	public void test() {
		
		TreeNode<String> pai = new TreeNode<String>("Mr Catra");
		TreeNode<String> filho1 = new TreeNode<String>("Filho 4");
		TreeNode<String> filho2 = new TreeNode<String>("Filho 5");
		
		pai.addChild("Filho 1");
		pai.addChild("Filho 2");
		pai.addChild("Filho 3");
		
		pai.addChild(filho1);
		pai.addChild(filho2);
		
		pai.getchildren().get(0).addChild("Filho 1 do Filho 1");
		pai.getchildren().get(0).addChild("Filho 2 do Filho 1");
		pai.getchildren().get(0).addChild("Filho 3 do Filho 1");
		
		pai.getchildren().get(1).addChild("Filho 1 do Filho 2");
		pai.getchildren().get(1).addChild("Filho 2 do Filho 2");
		pai.getchildren().get(1).addChild("Filho 3 do Filho 2");
		
		pai.getchildren().get(2).addChild("Filho 1 do Filho 3");
		pai.getchildren().get(2).addChild("Filho 2 do Filho 3");
		pai.getchildren().get(2).addChild("Filho 3 do Filho 3");
			pai.getchildren().get(2).getchildren().get(0).addChild("Outro filho 1");
			pai.getchildren().get(2).getchildren().get(0).addChild("Outro filho 2");
			pai.getchildren().get(2).getchildren().get(1).addChild("Outro filho 3");
			
		pai.print();
		
	}
}