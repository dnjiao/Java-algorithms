package string;

public class ReverseString {
	private static String reverseRecur(String str) {
		if (str.length() == 1) {
			return str;
		}
		char ch = str.charAt(0);
		return reverseRecur(str.substring(1)) + ch;
	}
	
	private static String reverseSwap(String s) {
		char[] chars = s.toCharArray();
		int l = 0;
		int r = s.length() - 1;
		while (l <= r) {
			swap(chars, l++, r--);
		}
		
		String str = new String(chars);
		return str;
		
	}
	
	private static void swap(char[] str, int l, int r) {
		char tmp = str[l];
		str[l] = str[r];
		str[r] = tmp;
	}
	public static void main(String[] args) {
		String str = "abcdefg";
		String newStr = reverseSwap(str);
		System.out.println(newStr);
	}
}
