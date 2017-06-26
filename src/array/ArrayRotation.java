package array;

import java.util.Arrays;

public class ArrayRotation {
	
	static void rotate(int[] a, int k) {
		if (k > a.length - 1) return;
		reverse(a, 0, k);
		reverse(a, k + 1, a.length - 1);
		reverse(a, 0, a.length - 1);
	}
	
	static void reverse(int[] a, int l, int r) {
		if (l >= r) return;
		while (l <= r) {
			swap(a, l++, r--);
		}
	}
	
	static void swap(int[] a, int l, int r) {
		int tmp = a[l];
		a[l] = a[r];
		a[r] = a[l];
		a[l] = tmp;
	}

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6};
		rotate(a, 2);
		Arrays.stream(a).forEach(System.out::println);;

	}

}
