package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
	
	public static List<Integer> sort(List<Integer> list) {	
		if (list.size() < 2) {
			return list;
		}
		int pivot = list.get(0);
		List<Integer> lower = new ArrayList<Integer>();
		List<Integer> higher = new ArrayList<Integer>();
		
		for (int i = 1; i < list.size(); i ++) {
			int num = list.get(i);
			if (num > pivot) {
				higher.add(num);
			} else {
				lower.add(num);
			}
		}
		List<Integer>sorted = sort(lower);
		sorted.add(pivot);
		sorted.addAll(sort(higher));
		return sorted;
	}

	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(38, 45, 20, 19, 137, 86, 992, 55, 43, 6, 10);
		List<Integer> sorted = sort(ints);
		for (int num : sorted) {
			System.out.println(num);
		}
	}
}
