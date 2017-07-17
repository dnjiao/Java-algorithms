package array;
/**
 * Given a binary array, find the index of 0 such that when that 0 is replaced with 1 results in longest continuous sequence of 1's. 
 * For example, for array {0,1,1,1,0,1,0} replacing 0 at 0th index with 1 results in a sequence of 1's with length 4 
 * and replacing 0 at index 4 with 1 results in a sequence of 1's with length 5. Hence for this input array, output returned should be 4.

For array {0,0,1,1,1,1,0,0,1,1,1,1,0,1,1,0,1,0,1,1,1,1,0} longest sequence of 1's is obtained when we replace 0 at index 12 with 1.
 * @author Oscar
 *
 */
public class FlipZeroLongestOneArray {
	
	int findIndexOfZero(int[] a) {
		int prev = -1;
		int prePrev = -1;
		int curr = -1;
		
		int max = -1;
		int len = -1;
		
		for (int i = 0; i < a.length; i++) {
			// if there are more than 3 zeros
			if (a[i] == 0) {
				if (prePrev != -1) {
					len = i - prePrev - 1;
					if (len > max) {
						max = len;
						curr = prev;
					}
				}
				prePrev = prev;
				prev = i;
			}
		}
		
		// If there are less than 3 zeros
		if (max == -1) {
			// if 2 zeros
			if (prePrev != -1) {
				if (prev > a.length - prePrev - 1) curr = prePrev;
				else curr = prev;
			} 
			// if only one zeros
			else curr = prev;
		}
		
		return curr;
		
	}

	public static void main(String[] args) {
		FlipZeroLongestOneArray f = new FlipZeroLongestOneArray();
		int[] a = {0,0,1,1,1,1,0,0,1,1,1,1,0,1,1,0,1,0,1,1,1,1,0};
		System.out.println(f.findIndexOfZero(a));

	}

}
