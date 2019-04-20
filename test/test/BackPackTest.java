package test;
import add.BackPack;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.Test;

public class BackPackTest {

	private BackPack backPack;
	
	@Before
	public void setUp() {
		backPack = new BackPack();
	}
	
	@Test
	public void backPackTest() {
		int m = 5, n = 3;
		int w[] = {2,2,1};
		int p[] = {4,10,1};
		int c[][] = {{0,0,0,0,0,0},{0,0,4,4,4,4},{0,0,10,10,14,14},{0,1,10,11,14,15}};
		assertArrayEquals(c, backPack.BackPack_Solution(m, n, w, p));
	}
}
