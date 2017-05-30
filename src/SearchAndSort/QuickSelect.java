package SearchAndSort;
/**
 * Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

For example, given [3,2,1,5,6,4] and k = 2, return 5.
 * @author Oscar
 *
 */
public class QuickSelect {
	
	int findKth(int[] arr, int k) {
		if (k < 0 || arr.length == 0) return 0;
		return findKth(arr, k, 0, arr.length - 1);
	}

	private int findKth(int[] arr, int k, int begin, int end) {
		int pivot = arr[end];
		int l = begin; 
		int r = end;
		while (true) {
			if (arr[l] < pivot) l++;
			if (arr[r] > pivot) r--;
			if (l == r) break;
			swap(arr, l, r);
		}
		
		swap(arr, l, end);
		
		if (k == l + 1) return pivot;
		else if (k > l + 1) {
			return findKth(arr, k - l - 1, l + 1, end);
		} else {
			return findKth(arr, k, begin, l);
		}
	}

	private void swap(int[] arr, int l, int r) {
		int tmp = arr[l];
		arr[l] = arr[r];
		arr[r] = tmp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
