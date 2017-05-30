package array;
/**
 * Given an array of distinct integers, find length of the longest subarray 
 * which contains numbers that can be arranged in a continuous sequence.
 *
 */
public class LongestContiguous {
	static int longestSubarray(int[] arr) {
		int n = arr.length;
		int max_len = 1;
		for (int i = 0; i < n - 1; i++) {
			int min = arr[i];
			int max = arr[i];
			for (int j = i + 1; j < n; j++) {
				min = (min > arr[j]) ? arr[j] : min;
				max = (max < arr[j]) ? arr[j] : max;
				
				if (max - min == j - i) {
					max_len = (max_len > j - i + 1) ? max_len : j - i + 1;
				}
			}
		}
		return max_len;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
