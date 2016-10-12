package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

	public static List<Integer> sort(List<Integer> list) {
		if (list.size() < 2) {
			return list;
		}
		int median = list.size() / 2;
		List<Integer> left = list.subList(0, median);
		List<Integer> right = list.subList(median, list.size());
		List<Integer> leftSorted = sort(left);
		List<Integer> rightSorted = sort(right);
		List<Integer> sorted = merge(leftSorted, rightSorted);
		return sorted;
	}
	private static List<Integer> merge(List<Integer> left, List<Integer> right) {
		List<Integer> all = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		while (i < left.size() && j < right.size()) {
			if (left.get(i) < right.get(j)) {
				all.add(left.get(i++));
			} else {
				all.add(right.get(j++));
			}
		}
		while (i < left.size()) {
			all.add(left.get(i++));
		}
		while (j < right.size()) {
			all.add(right.get(j++));
		}
		return all;
	}
	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(38, 45, 20, 19, 137, 86, 992, 55, 43, 6, 10);
		List<Integer> sorted = sort(ints);
		for (int num : sorted) {
			System.out.println(num);
		}

	}

}
