package array;

import java.util.Arrays;

/**
 * Given an array with positive and negative elements in it, re-arrange these elements such that positive and negative elements are placed in alternate order. 
 * For example, if the input array is {-1,3,2,4,5,-6,7,-9} output should be {3,-1,2,-6,4,-9,5,7}
 * @author Oscar
 *
 */
public class PositiveNegativeAlternation {
	
	void alternate(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if (!isRightPosition(arr, i)) {
				int index = findNext(arr, i);
				
				// if next number not found, break out of loop and exit the method
				if (index == -1) break;
				shift(arr, i, index);
				
			}
		}
		
		Arrays.stream(arr).forEach(System.out::println);
	}

	private void shift(int[] a, int i, int index) {
		int num = a[index];
		for (int j = index; j > i; j--) {
			a[j] = a[j - 1];
		}
		a[i] = num;
		
	}

	// find next number in array after i that should be in i position
	// return -1 if can't find any
	private int findNext(int[] arr, int i) {
		for (int k = i; k < arr.length; k++) {
			if (arr[i] * arr[k] < 0) 
				return k;
		}
		return -1;
	}

	// positive number on even positions
	// negative numbers on odd positions
	private boolean isRightPosition(int[] a, int i) {
		if (i % 2 == 0 && a[i] > 0 || i % 2 == 1 && a[i] < 0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		PositiveNegativeAlternation solution = new PositiveNegativeAlternation();
		int[] a = {-1,3,2,4,5,-6,7,-9};
		solution.alternate(a);

	}

}
