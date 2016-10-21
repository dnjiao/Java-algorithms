package array;

import java.util.Arrays;

public class DedupIntArray {

	public static int[] removeDuplicate(int[] nums) {
		int i = 0;
		int j = 1;
		while (j < nums.length) {
			if (nums[i] == nums[j]) {
				j++;
			}
			else {
				i++;
				nums[i] = nums[j];
				j++;
			}
		}
		int[] newarray = Arrays.copyOf(nums, i + 1);
		return newarray;
	}
	public static void main(String[] args) {
		int[] A = {2, 3, 5, 5, 7, 8, 8, 10, 10, 10, 10, 15, 16};
		int[] B = removeDuplicate(A);
		System.out.println(Arrays.toString(B));
	}
}
