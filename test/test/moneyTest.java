package test;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import add.Money;

public class moneyTest {

	@Test
	public void test() {
		Money money = new Money();
		assertEquals("����",money.div(1));
		assertEquals("����",money.div(83));
		assertEquals("����",money.div(4));
		assertEquals("����",money.div(84));
		assertEquals("����",money.div((float) 0.5));
		assertEquals("����",money.div((float) 1.5));
		assertEquals("����������",money.div(-1));
		assertEquals("����������",money.div(0));
		assertEquals("����������",money.div((float) -0.5));
	}

}
