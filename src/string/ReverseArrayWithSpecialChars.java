package string;
/**
 * Given a string, that contains special character together with alphabets
 *  (‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the string in a way that 
 *  special characters are not affected.
 * 
 * SOLUTION: 1) Let input string be 'str[]' and length of string be 'n'
2) l = 0, r = n-1
3) While l is smaller than r, do following
    a) If str[l] is not an alphabetic character, do l++
    b) Else If str[r] is not an alphabetic character, do r--
    c) Else swap str[l] and str[r]
 *
 */
public class ReverseArrayWithSpecialChars {

	static void reverseArray(char[] chars) {
		if (chars.length == 0) return;
		
		int l = 0;
		int r = chars.length - 1;
		
		while (l < r) {
			if (!isChar(chars[l])) l++;
			else if (!isChar(chars[r])) r--;
			else {
				swap(chars, l, r);
				l++;
				r--;
			}
		}
	}
	private static void swap(char[] chars, int l, int r) {
		char tmp = chars[l];
		chars[l] = chars[r];
		chars[r] = tmp;
		
	}
	private static boolean isChar(char c) {
		if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') return true;
		return false;
	}
	
	
	public static void main(String[] args) {
		char[] str = {'a', '%', 'b', 'c', '$', '1', 'd'};
		reverseArray(str);
		System.out.println(new String(str));

	}

}
