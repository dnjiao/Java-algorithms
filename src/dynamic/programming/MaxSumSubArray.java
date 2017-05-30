package dynamic.programming;
/**
 * Question: A sub-array has one number of some continuous numbers. 
 * Given an integer array with positive numbers and negative numbers, get the maximum sum of all sub-arrays. 
 * Time complexity should be O(n).

For example, in the array {1, -2, 3, 10, -4, 7, 2, -5}, its sub-array {3, 10, -4, 7, 2} has the maximum sum 18.



 * @author Oscar
 *
 */
public class MaxSumSubArray {
	
	public static int maxsum(int a[]) {
		if (a.length == 0) return 0;
		
		int sum = 0;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			if (sum < 0) sum = a[i];
			else sum += a[i];
			
			if (sum > max) max = sum;
		}
		
		return max;
		
	}
	

	public static void main(String[] args) {
		int a[] = {1, -2, 3, 10, -4, 7, 2, -5};
		
		System.out.println(maxsum(a));

	}

}
