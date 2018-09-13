package test;

import org.junit.jupiter.api.Test;

import ch7.SortIntegers;

class SortIntegersTest {

	@Test
	void testSort() {
		SortIntegers sorter = new SortIntegers();
		sorter.sort(new int[] {1,2,3});
		sorter.sort(new int[] {1,2,3,2});
	}

}
