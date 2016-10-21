package array;

import java.util.Arrays;

public class FindRangeInArray {
	public static int[] findRange(int[] nums, int target) {
		int[] range = new int[2];
		range[0] = -1;
		range[1] = -1;
		
		binarySearch(nums, 0, nums.length - 1, target, range);
		return range;
	}

	private static void binarySearch(int[] nums, int left, int right, int target, int[] range) {
		if (left > right) {
			return;
		}
		if (nums[left] == nums[right] && nums[left] == target) {
			range[0] = left;
			range[1] = right;
			return;
		}
		int mid = left + (right - left) / 2;
		if (nums[mid] > target) {
			binarySearch(nums, left, mid - 1, target, range);
		} else if (nums[mid] < target) {
			binarySearch(nums, mid + 1, right, target, range);
		} else {
			range[0] = mid;
			range[1] = mid;
			int t1 = mid;
			while (t1 > left && nums[t1] == target) {
				t1--;
				range[0] = t1;
			}
			
			int t2 = mid;
			while (t2 < right && nums[t2] == target) {
				t2++;
				range[1] = t2;
			}
			
		}
		
		
		
	}

	public static void main(String[] args) {
		int[] nums = {5, 7, 7, 8, 8, 10};
		int[] range = findRange(nums, 8);
		System.out.println(Arrays.toString(range));

	}

}
