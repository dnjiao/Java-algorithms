package array;
/**
 * Given an array of integers that is already sorted in ascending order, 
 * find two numbers such that they add up to a specific target number.
 * @author Oscar
 *
 */
public class TwoSumSortedArray {

	public static void getIndexes(int[] array, int num) {
		int begin = 0;
		int end = array.length - 1;
		while (begin < end) {
			int sum = array[begin] + array[end];
			if (sum > num) {
				end--;
			} else if (sum < num){
				begin++;
			} else {
				System.out.println(array[begin] + " " + array[end]);
				return;
			}
		}
		System.out.println("Can't find two numbers");
	}
	public static void main(String[] args) {
		int[] A = {2, 4, 5, 7, 8, 10, 15, 16};
		getIndexes(A, 13);

	}

}
