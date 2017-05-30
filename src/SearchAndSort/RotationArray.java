package SearchAndSort;

/**
 * Question: When some elements at the beginning of an array are moved to the end, it gets a rotation of the original array. 
 * Please implement a function to search a number in a rotation of an increasingly sorted array. 
 * Assume there are no duplicated numbers in the array.
For example, array {3, 4, 5, 1, 2} is a rotation of array {1, 2, 3, 4, 5}. 
If the target number to be searched is 4, the index of the number 4 in the rotation 1 should be returned. 
If the target number to be searched is 6, -1 should be returned because the number does not exist in the rotated array.
 * @author Oscar
 *
 */
public class RotationArray {
	
	public static int searchInRotation(int[] a, int k, int first, int last) {
		int mid = (first + last) / 2;
		if (a[mid] == k) {
			return mid;
		}
		
		// first half is sorted
		if (a[mid] > a[first]) {
			// binary search if k in first half
			if (a[mid] > k && k > a[first]) {
				return binarySearch(a, k, first, mid);
			}
			else {
				return searchInRotation(a, k, mid, last);
			}
		}
		// second half is sorted
		else if (a[mid] < a[last]) {
			if (a[mid] < k && a[last] > k) {
				return binarySearch(a, k, mid, last);
			}
			else {
				return searchInRotation(a, k, first, mid);
			}
		}
		
		return -1;
	}
	
	public static int binarySearch(int[] a, int k, int first, int last) {
		int l = first, r = last;
		
		while (l <= r) {
			int mid = (l + r) / 2;
			if (a[mid] > k) r = mid -1;
			else if (a[mid] < k) l = mid + 1;
			else return mid;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] a = {7, 8, 1, 2, 3, 4, 5, 6};
		System.out.println(searchInRotation(a, 8, 0, 7));
	}

}
