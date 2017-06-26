package string;

public class ShortestPalindrome {
	
	static String getPalindrome(String s) {
		if (s == null) return null;
		if (s.length() == 1) return s;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1))
				break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
