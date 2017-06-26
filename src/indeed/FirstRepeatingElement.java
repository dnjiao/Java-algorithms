package indeed;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingElement {
	
	public static <T> int findFirstRepeatingElement(T[] arr) {
		int min = -1;
		Set<T> set = new HashSet<T>();
		
		for (int i = arr.length - 1; i >= 0; i--) {
			if (set.contains(arr[i])) min = i;
			else
				set.add(arr[i]);
		}
		
		if (min != -1) {
			System.out.println(arr[min]);
		}
		return min;
	}

	public static void main(String[] args) {
		String[] a = {"a", "b", "c", "d", "e", "f", "c", "f", "g"};
		findFirstRepeatingElement(a);
		
		Integer[] b = {1, 3, 5, 7, 9, 6, 6, 4, 8, 10};
		findFirstRepeatingElement(b);
		

	}

}
