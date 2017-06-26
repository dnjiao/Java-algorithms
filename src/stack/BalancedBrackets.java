package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {
	
	static boolean isBalanced(char[] str) {
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		
		Stack<Character> stack = new Stack<Character>();
		for (char c : str) {
			if (map.containsKey(c)) {
				stack.push(c);
			} else if (map.containsValue(c)) {
				if (!stack.empty() && map.get(stack.peek()) == c) {
					stack.pop();
				}
				else return false;
			}
		}
		if (stack.empty()) return true;
		return false;
	}

	public static void main(String[] args) {
		char[] chars = new char[] {'{', '[', ')', '(', ']', '}'};
		System.out.println(isBalanced(chars));

	}

}
