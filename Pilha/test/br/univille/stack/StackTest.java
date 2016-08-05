package br.univille.stack;

import org.junit.Assert;
import org.junit.Test;

import br.univille.stack.Stack;

public class StackTest {
	
	@Test
	public void stackTest(){
		Stack<String> s = new Stack<>();
		
		Assert.assertTrue(s.isEmpty());
		
		s.push("A");
		
		Assert.assertFalse(s.isEmpty());
		Assert.assertEquals(1, s.getSize());
		
		s.push("C");
		s.push("B");
		s.push("D");
		
		Assert.assertFalse(s.isEmpty());
		Assert.assertEquals(4, s.getSize());
		
		Assert.assertEquals("D", s.top());
		Assert.assertEquals("D", s.top());
		Assert.assertEquals("D", s.top());
		Assert.assertEquals(4, s.getSize());
		
		
		Assert.assertEquals("D", s.pop());
		Assert.assertEquals(3, s.getSize());
		
		Assert.assertFalse(s.isEmpty());
		Assert.assertEquals("B", s.pop());
		Assert.assertEquals(2, s.getSize());
		
		Assert.assertEquals("C", s.top());
		Assert.assertEquals("C", s.top());
		Assert.assertEquals("C", s.top());
		Assert.assertEquals("C", s.top());
		
		Assert.assertFalse(s.isEmpty());
		
		Assert.assertEquals(20, s.getCapacity());
		
		s.push("C");
		s.push("B");
		s.push("D");
		s.push("C");
		s.push("B");
		s.push("D");
		s.push("B");
		s.push("D");
		s.push("B");
		s.push("D");
		s.push("B");
		s.push("D");
		s.push("B");
		s.push("D");
		s.push("B");
		s.push("D");
		s.push("B");
		s.push("D");
		
		Assert.assertEquals(20, s.getSize());
		
		//Testar capacidade.
		Assert.assertEquals(20, s.getCapacity());
		
		//Redimensionar array
		s.push("B");
		
		//Testar capacidade, pois deverá dobrar.
		Assert.assertEquals(40, s.getCapacity());
		
		s.push("D");
	}
	
	@Test
	public void resizeTest(){
		Stack<Integer> s = new Stack<>();
		
		int x = 1000000;
		
		for (int i = 0; i < x; i++) {
			s.push((int)(Math.random()*1000));
		}
		
		for (int i = 0; i < x; i++) {
			s.pop();
		}
		
		s.push(1);
		s.push(2);
		
		Assert.assertEquals(new Integer(2), s.pop());
		Assert.assertEquals(new Integer(1), s.pop());
		Assert.assertEquals(null, s.pop());
	}
}
