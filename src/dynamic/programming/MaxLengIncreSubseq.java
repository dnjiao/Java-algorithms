package dynamic.programming;

/**
 * Problem: Given an unsorted array, find the max length of subsequence in which the numbers are in incremental order.

 *	For example: If the input array is {7, 2, 3, 1, 5, 8, 9, 6}, a subsequence with the most numbers in incremental order 
 *  is {2, 3, 5, 8, 9} and the expected output is 5.
 * @author Oscar
 *
 */
public class MaxLengIncreSubseq {
	
	public static int maxLength(int a[]) {
		
		if (a.length == 0) return 0;
		
		int longest[] = new int[a.length];
		
		for (int i = 1; i < a.length; i++) {
			int max = 0;
			for (int j = 0; j < i; j++) {
				if (a[j] < a[i] && longest[j] > max) {
					max = longest[j];
				}
			}
			longest[i] = max + 1;
		}
		
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (longest[i] > max) max = longest[i];
		}
		
		return max;
		
	}
	
	public static void main(String[] args) {
		int a[] = {7, 2, 3, 1, 5, 8, 9, 6};
		System.out.println(maxLength(a));
	}

}
