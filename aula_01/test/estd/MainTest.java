package estd;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

	/*
	public static void main(String[] args) {
		
	}
	*/
	
	@Test
	public void testGetHello() {
		Assert.assertEquals("Hello", MainProgram.getHello());
		Assert.assertNotEquals("Hello2", MainProgram.getHello());
		Assert.assertNotEquals("HelloFail", MainProgram.getHello());
		Assert.assertNotEquals("HelloError", MainProgram.getHello());
		Assert.assertNotEquals("HelloAnotherError", MainProgram.getHello());
	}
}