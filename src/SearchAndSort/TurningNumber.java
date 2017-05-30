package SearchAndSort;

/**
 * Turning number is the maximum number in an array which increases and then decreases. 
 * This kind of array is also named unimodal array. 
 * Please write a function which gets the index of the turning number in such an array.

For example, the turning number in array {1, 2, 3, 4, 5, 10, 9, 8, 7, 6} is 10, so its index 5 is the expected output.
 * @author Oscar
 *
 */
public class TurningNumber {
	
	public static int findTurningNum(int[] a) {
		if (a.length == 0 || a.length == 1) return -1;
		
		int left = 0;
		int right = a.length - 1;
		
		while (right > left) {
			int mid = (left + right) / 2;
			if (a[mid] > a[mid - 1] && a[mid] > a[mid + 1]) return mid;
			else {
				if (a[mid] > a[mid -1] && a[mid] < a[mid + 1]) left = mid;
				else
					right = mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 10, 12, 9, 8, 7, 6};
		System.out.println(findTurningNum(a));
	}

}
