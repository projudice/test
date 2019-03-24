package test;

import org.junit.Before;
import org.junit.Test;

import add.PrintPrimes;

public class PrintPrimesTest {

	private PrintPrimes pPrimes;
	
	@Before
	public void setUp() {
		pPrimes = new PrintPrimes();
	}
	
	@Test
	public void test() {
		pPrimes.printPrimes(4);
	}
}
