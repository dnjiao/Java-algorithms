package indeed;

import java.util.Stack;

/**
 * Problem: Define a stack, in which we can get its minimum number with a function min. 
 * In this stack, the time complexity of min(), push() and pop() are all O(1).
 * 
 * SOLUTION:
 *  Since value is greater than or equal to min, it is pushed into data stack direct without updating min. 
 *  Therefore, when we find that the top of data stack is greater than or equal to min, 
 *  we can pop directly without updating min. 
 *  However, if we find value is less then min, we push 2*value-min. 
 *  We should notice that 2*value-min should be less than value. Then we update current min as value. 
 *  Therefore, the new top of data stack (top) is less than the current min. 
 *  Therefore, when we find that the top of data stack is less then min, the real top (real pushed number value) is stored in min. 
 *  After we pop the top of data stack, we have to restore the previous minimum number. 
 *  Since top = 2*value-previous min and value is current min, pervious min is 2*current min - top.  
 * @author Oscar
 *
 */
public class StackWithMin {
	Stack<Integer> stack;
	int min;
	
	public void push(int val) {
		if (val > min) {
			stack.push(val);
		} else {
			int top = 2 * val - min;
			stack.push(top);
			min = val;
		}
	}
	
	public int pop() {
		if (stack.peek() > min) {
			int out = stack.peek();
			stack.pop();
			return out;
		}
		int top = stack.pop();
		int result = min;
		min = 2*min - top;
		return result;
		
	}

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

	}

}
