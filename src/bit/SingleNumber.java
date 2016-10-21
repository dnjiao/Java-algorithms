package bit;
/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * @author Oscar
 *
 */
public class SingleNumber {

	public static int findSingleNumber(int[] array) {
		int x = array[0];
		for (int i = 1; i < array.length; i++) {
			x = x ^ array[i];
		}
		return x;
	}
	public static void main(String[] args) {
		int[] array = {15, 20, 15, 21, 20};
		System.out.println(findSingleNumber(array));

	}

}
