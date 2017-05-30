package SearchAndSort;

public class InsertionSort {
	
	public static void sort(int[] nums) {
		for (int i=1; i<nums.length; i++) {
			for (int j=i; j>0; j--) {
				if (nums[j] < nums[j - 1]) {
					swap(nums, j, j-1);
				}
			}
		}
		
		
	}
	
	private static void print(int[] array) {
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	public static void main(String[] args) {
		int[] array = {94, 98, 76, 84, 4, 7, 5, 10, 2};
		sort(array);
		print(array);

	}

}
