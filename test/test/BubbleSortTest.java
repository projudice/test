package test;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.Test;

import add.BubbleSort;

public class BubbleSortTest {

	private BubbleSort bubbleSort;
	
	@Before
	public void setUp() {
		bubbleSort = new BubbleSort();
	}
	
	@Test
	public void bubbleSortTest() {
		int expected[] = {1,2,3};
		int rawArray[] = {1,3,2};
		assertArrayEquals(expected, bubbleSort.BubbleSort(rawArray));
	}
}
