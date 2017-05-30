package array;

import java.util.Arrays;

/**
 * Given an array of distinct integers and a sum value. 
 * Find count of triplets with sum smaller than given sum value. 
 * 
 * @author H184870
 *
 */
public class TripletsCounter {
	
	static int countTriplets(int[] arr, int sum) {
		Arrays.sort(arr);
		int count = 0;
		int n = arr.length;
		for (int i = 0; i < n - 2; i++) {
			int j = i + 1;
			int k = n - 1;
			while (j < k) {
				if (arr[i] + arr[j] + arr[k] >= sum) {
					k--;
				} else {
					count += k - j;
					j++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = {5, 1, 3, 4, 7};
		int sum = 12;
		System.out.println(countTriplets(arr, sum));

	}

}
