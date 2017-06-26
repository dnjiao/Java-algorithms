package array;
/**
 * Given an array of integers(positive or negative), print the next greater element of all elements in the array. 
 * If there is no greater element then print null.
 * Next greater element of an array element array[i], is an integer array[j], such that
 * 1. array[i] < array[j]
 * 2. i < j
 * 3. j - i is minimum
 * i.e. array[j] is the first element on the right of array[i] which is greater than array[i].
 */
import java.util.Stack;

public class NextGreaterNum {
	
	static void findNextGreaterNumber(int[] arr) {
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (stack.empty()) {
				stack.push(arr[i]);
			} else {
				if (stack.peek() < arr[i]) {
					System.out.println(stack.peek() + ": " + arr[i]);
					stack.pop();
					// push the greater number in stack
					stack.push(arr[i]);
				} else {
					stack.push(arr[i]);
				}
			}
		}
		while (!stack.empty()) {
			System.out.println(stack.pop() + ": null");
		}
	}

	public static void main(String[] args) {
		int[] a = {98, 23, 54, 12, 20, 7, 27};
		findNextGreaterNumber(a);

	}

}
