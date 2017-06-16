package indeed;
/**
 * You're given an array of integers sorted ( [1,2,3,5,6,7]) 
 * you need to serialize and compress this array into a string (1-3, 5-7)
 *
 */
public class NumberArrayCompressor {

	private static String compressArray(int[] numbers) {
		StringBuilder sb = new StringBuilder();
		int first = numbers[0];
		int prev = first;
		for (int i = 1; i < numbers.length; i++) {
			if (prev == numbers[i] - 1) {
				prev = numbers[i];
			} else {
				if (first == prev) {
					sb.append(first).append(",");
					first = numbers[i];
					prev = numbers[i];
				} else {
					sb.append(first).append("-").append(prev).append(",");
					first = numbers[i];
					prev = numbers[i];
				}
			}
		}
		int last = numbers[numbers.length - 1];
		if (first != last) {
			sb.append(first).append("-").append(last);
		} else {
			sb.append(last);
		}
		return sb.toString();
		
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,5,6,7,9};
		System.out.println(compressArray(arr));

	}

}
