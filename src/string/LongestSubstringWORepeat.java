package string;

public class LongestSubstringWORepeat {

	public static int findLengthOfSubstring(String str) {
		int max = 0;
		int count = 0;
		if (str.length() < 2) {
			return 1;
		}
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) != str.charAt(i + 1)) {
				count++;
			} else {
				if (count > max) {
					max = count;
				}
				count = 0;
			}
		}
		return max;
		
	}
	public static void main(String[] args) {
		String str = "abceeqyzffiwwwwrty";
		System.out.println(findLengthOfSubstring(str));

	}

}
