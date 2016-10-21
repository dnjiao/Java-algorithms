package number;

import java.util.Arrays;

public class PairNumsOfSum {

	// find pair of numbers from array which sum equals a certain number
	public static void findPairs(int sum, int[] array) {
		Arrays.sort(array);
		int first = 0;
		int last = array.length - 1;
		while (first < last) {
			if (array[first] + array[last] == sum) {
				System.out.println(array[first++] + " " + array[last--]);
			} else {
				if (array[first] + array[last] < sum) {
					first++;
				} else {
					last--;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		int[] a = {4, -1, 5, 6, 2, -9, 0, 10, 8, 19, 13};
		findPairs(10, a);

	}

}
