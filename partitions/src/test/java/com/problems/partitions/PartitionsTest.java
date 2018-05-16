package com.problems.partitions;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.problems.partitions.Partitions;

public class PartitionsTest {

	private List<Integer> list;

	@Before
	public void init() {
		list = Arrays.asList(1, 2, 3, 4, 5);
	}

	@Test
	public void testIfSubListSizeIsEqualToOne() {
		List<List<Integer>> result = Partitions.partition(list, 1);
		List<List<Integer>> expectedResult = Arrays.asList(Arrays.asList(1), Arrays.asList(2), Arrays.asList(3),
				Arrays.asList(4), Arrays.asList(5));
		Assert.assertEquals(expectedResult, result);
		// [[1], [2], [3], [4], [5]]
	}

	@Test
	public void testIfSubListSizeIsEqualToTwo() {

		List<List<Integer>> result = Partitions.partition(list, 2);
		List<List<Integer>> expectedResult = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5));
		Assert.assertEquals(expectedResult, result);
		// [[1, 2], [3, 4], [5]]
	}

	@Test
	public void testIfSubListSizeIsEqualToThree() {
		List<List<Integer>> result = Partitions.partition(list, 3);
		List<List<Integer>> expectedResult = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5));
		Assert.assertEquals(expectedResult, result);
		// [[1, 2, 3], [4, 5]]
	}

	@Test
	public void testIfSubListSizeIsGreatThanListSize() {
		List<List<Integer>> result = Partitions.partition(list, 6);
		Assert.assertNull(result);
		// null
	}

	@Test
	public void testIfSubListSizeIsEqualToListSize() {
		List<List<Integer>> result = Partitions.partition(list, 5);
		List<List<Integer>> expectedResult = Arrays.asList(Arrays.asList(1, 2, 3, 4, 5));
		Assert.assertEquals(expectedResult, result);
		// [[1, 2, 3, 4, 5]]
	}
}
