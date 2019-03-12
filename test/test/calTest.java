package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import add.Cal;

public class calTest {

	@Test
	public void addTest() {
		Cal cal = new Cal();
		assertEquals(5, cal.add(2, 3));
	}
}
