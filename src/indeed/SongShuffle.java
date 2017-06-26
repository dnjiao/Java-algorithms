package indeed;

import java.util.Random;

public class SongShuffle {
	
	static void shuffle(int[] arr) {
		int n = arr.length;
		Random rand = new Random();
		for (int i = n - 1; i >= 0; i--) {
			int j = rand.nextInt(i + 1);
			System.out.println(arr[j]);
			swap(arr, i, j);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
		
	}

	public static void main(String[] args) {
		int[] a = {3, 4, 5, 6, 7, 8, 9, 10, 1, 2};
		shuffle(a);

	}

}
