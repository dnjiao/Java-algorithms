package array;
/**
 * Given an array of integers, print the leaders in the array. 
 * A leader is an element which is larger than all the elements in the array to its right.
 * For example:
 * Input Array:
 * { 98, 23, 54, 12, 20, 7, 27 }
 * Output:
 * Leaders- 27 54 98
 * @author Oscar
 *
 */
public class LeaderInArray {
	
	static void findLeader(int[] arr) {
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		for (int i = n - 1; i >= 0; i--) {
			if (arr[i] > max) {
				max = arr[i];
				System.out.println(max);
			}
		}
	}

	public static void main(String[] args) {
		int[] a = {98, 23, 54, 12, 20, 7, 27};
		findLeader(a);

	}

}
