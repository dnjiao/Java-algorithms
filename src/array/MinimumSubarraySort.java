package array;

/**
 * Given an unsorted array arr[0..n-1] of size n, find the minimum length subarray arr[s..e] such that sorting this subarray makes the whole array sorted.
 * Examples:
 * If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60], your program should be able to find that the subarray lies between the indexes 3 and 8.
 */


public class MinimumSubarraySort {
	public static int solution(int[] A) {
		int n = A.length;
		int l =  0, r = n - 1;
		
		// first element from left greater than next one
		for (int i = 0; i < n - 1; i++) {
			if (A[i] > A[i + 1]) {
				l = i;
				break;
			}
		}
		
		// first element from right less than next one
		for (int j = n - 1; j > 1; j--) {
			if (A[j] < A[j - 1]) {
				r = j;
				break;
			}
		}
		
		// min and max of sub group
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = l; i <= r; i++) {
			if (A[i] > max) 
				max = A[i];
			if (A[i] < min)
				min = A[i];
		}
		
		for (int i = 0; i < l; i++) {
			if (A[i] > min) {
				l = i;
				break;
			}
		}
		
		for (int j = n - 1; j > r; j--) {
			if (A[j] < max) {
				r = j;
				break;
			}
		}
		
		return r - l + 1;
		
		
	}

	public static void main(String[] args) {
		int[] a = {1, 2, 6, 5, 5, 8, 9};
		System.out.println(solution(a));
	}

}
