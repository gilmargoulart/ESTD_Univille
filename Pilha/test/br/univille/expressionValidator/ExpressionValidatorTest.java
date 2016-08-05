package br.univille.expressionValidator;

import org.junit.Assert;
import org.junit.Test;


public class ExpressionValidatorTest {
	
	@Test
	public void expressionValidatorTest(){
		
		String expression = "((2+3) * (7–5))/2";
		ExpressionValidator v = new ExpressionValidator(expression);
		Assert.assertTrue(v.testExpression());
		
		expression = "{((2+3) * (7–5))/2";
		v = new ExpressionValidator(expression);
		Assert.assertFalse(v.testExpression());
		
		expression = "((2+3) * (7–5)])/2";
		v = new ExpressionValidator(expression);
		Assert.assertFalse(v.testExpression());
		
		expression = "{((2+3) * (7–5)))/2]";
		v = new ExpressionValidator(expression);
		Assert.assertFalse(v.testExpression());
		
		expression = "{[((2+3) * (7–5))/2]}";
		v = new ExpressionValidator(expression);
		Assert.assertTrue(v.testExpression());
	}
}
