package number;

import java.util.Arrays;

public class TwoLargestNumbers {

	public void findTwoBigNumbers(int[] array) {
		Arrays.sort(array);
		int len = array.length;
		System.out.println(array[len - 1]);
		System.out.println(array[len - 2]);
	}
	
	public static int findSecondLargestNumberWOSort(int[] a) {
		int fLarge = 0;
		int sLarge = 0;
		for (int i = 0; i < a.length; i++) {
			if (fLarge < a[i]) {
				sLarge = fLarge;
				fLarge = a[i];
			
			} 
			else if (sLarge < a[i]) {
				sLarge = a[i];
			}
		}
		return sLarge;
	}
	public static void main(String[] args) {
		int[] nums = {4,2,100,56,32, 1999, 565};
		TwoLargestNumbers twoLargeNum = new TwoLargestNumbers();
		twoLargeNum.findTwoBigNumbers(nums);
		System.out.println(findSecondLargestNumberWOSort(nums));

	}

}
