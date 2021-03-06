package estd;

import org.junit.Assert;
import org.junit.Test;

public class SumNumbersTest {

	@Test
	public void testSum() {
		Assert.assertEquals(4, new SumNumbers().sum(2, 2));
		Assert.assertEquals(0, new SumNumbers().sum(2, -2));
		Assert.assertEquals(10, new SumNumbers().sum(7, 3));
		Assert.assertEquals(5864654, new SumNumbers().sum(2932327, 2932327));
		Assert.assertEquals(-2525, new SumNumbers().sum(2000, -4525));
		Assert.assertEquals(666, new SumNumbers().sum(60, 606));
		Assert.assertNotEquals(-995955, new SumNumbers().sum(0, 0));
		Assert.assertNotEquals(-0, new SumNumbers().sum(0, Integer.MAX_VALUE));
		Assert.assertEquals(-1, new SumNumbers().sum(Integer.MIN_VALUE, Integer.MAX_VALUE));
		//Assert.assertEquals(0, new SumNumbers().sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
	}

}
