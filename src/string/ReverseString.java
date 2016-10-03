package string;

public class ReverseString {
	private static String reverse(String str) {
		if (str.length() == 1) {
			return str;
		}
		char ch = str.charAt(0);
		return reverse(str.substring(1)) + ch;
	}
	
	public static void main(String[] args) {
		String str = "abcdefg";
		String newStr = reverse(str);
		System.out.println(newStr);
	}
}
