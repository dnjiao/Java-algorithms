package sort;

public class BubbleSort {
	
	public static void sort(int[] array) {
		for (int n=array.length-1; n > 0; n--) {
			for (int i=0; i < n; i++) {
				if (array[i] > array[i+1]) {
					swap(array, i, i+1);
				}
			}
		}
		printArray(array);
		
	}
	private static void printArray(int[] array) {
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
		int[] array = {87, 3, 27, 15, 20, 38, 98, 5};
		sort(array);

	}

}
