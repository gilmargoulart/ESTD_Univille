package warmup1;

import org.junit.Assert;
import org.junit.Test;

public class WarmUp1Tests {
	
	@Test
	public void sleepIn() {
		SleepIn s = new SleepIn();

		Assert.assertTrue(s.sleepIn(false, false));
		Assert.assertFalse(s.sleepIn(true, false));
		Assert.assertTrue(s.sleepIn(false, true));		
	}
	
	@Test
	public void monkeyTrouble() {
		MonkeyTrouble m = new MonkeyTrouble();
		
		Assert.assertTrue(m.monkeyTrouble(true, true));
		Assert.assertTrue(m.monkeyTrouble(false, false));
		Assert.assertFalse(m.monkeyTrouble(true, false));
		Assert.assertFalse(m.monkeyTrouble(false, true));
	}
}
