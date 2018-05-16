package com.problems.partitions;

import java.util.ArrayList;
import java.util.List;

public class Partitions{

	public static List<List<Integer>> partition(List<Integer> list, int subListSize) {
		if (subListSize == list.size()) {
			List<List<Integer>> subLists = new ArrayList<>();
			subLists.add(list);
			return subLists;
		} else if (subListSize < list.size() && subListSize > 0) {
			return getSubLists(list, subListSize);

		} else {
			return null;
		}
	}

	private static List<List<Integer>> getSubLists(List<Integer> list, int subListSize) {
		List<List<Integer>> subLists = new ArrayList<>();
		
		int subListsCount = list.size() / subListSize;
		
		int beginIndex = 0;
		int endIndex = subListSize;
		
		for (int i = 0; i < subListsCount; i++) {
			subLists.add(list.subList(beginIndex, endIndex));

			if (i < subListsCount - 1) {
				beginIndex += subListSize;
				endIndex += subListSize;
			}
		}
		if (list.size() % subListSize > 0) {
			beginIndex += subListSize;
			subLists.add(list.subList(beginIndex, list.size()));
		}

		return subLists;
	}

}
