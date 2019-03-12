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
		assertEquals("可行",money.div(1));
		assertEquals("可行",money.div(83));
		assertEquals("不行",money.div(4));
		assertEquals("不行",money.div(84));
		assertEquals("不行",money.div((float) 0.5));
		assertEquals("不行",money.div((float) 1.5));
		assertEquals("输入无意义",money.div(-1));
		assertEquals("输入无意义",money.div(0));
		assertEquals("输入无意义",money.div((float) -0.5));
	}

}
