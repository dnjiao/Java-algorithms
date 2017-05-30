package array;
/**
 * A unsorted array of integers is given; 
 * you need to find the max product formed my multiplying three numbers. 
 * (You cannot sort the array, watch out when there are negative numbers)
 * 
 */
public class MaxProductOfTriplets {
	
	static int findMaxProduct(int[] arr) {
		if (arr.length < 3) return Integer.MAX_VALUE;
		// Three max values
		int maxA = Integer.MIN_VALUE;
		int maxB = Integer.MIN_VALUE;
		int maxC = Integer.MIN_VALUE;
		
		// Two min values (in case two negative numbers)
		int minA = Integer.MAX_VALUE;
		int minB = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxA) {
				maxA = arr[i];
				maxB = maxA;
				maxC = maxB;
			} else if (arr[i] > maxB) {
				maxB = arr[i];
				maxA = maxB;
			} else if (arr[i] > maxA) {
				maxA = arr[i];
			}
			
			if (arr[i] < minA) {
				minA = arr[i];
				minB = minA;
			} else if (arr[i] < minB) {
				minB = arr[i];
			}
		}
		
		return (maxA * maxB * maxC > minA * minB * maxA) ? maxA * maxB * maxC : minA * minB * maxA;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
