package string;

public class MinInsertionForPalindrom {
	
	static int getMinInsertion (String str, int l, int r) {
		if (l > r) return Integer.MAX_VALUE;
		if (l == r) return 0;
		// return 1 for "ab", return 0 for "aa"
		if (l == r - 1) return (str.charAt(l) == str.charAt(r)) ? 0 : 1;
		
		if (str.charAt(l) == str.charAt(r)) {
			return getMinInsertion(str, l + 1, r - 1);
		}
		
		return Math.min(getMinInsertion(str, l, r - 1), getMinInsertion(str, l + 1, r)) + 1;
	}
	
	// Dynamic Programming solution
	
	static int getMinInsertionDP(String str) {
		int n = str.length();
		int[][] dpTab = new int[n][n];
		int l, h, len;
		for (len = 1; len < n; len++) {
			for (l = 0, h = len; h < n; l++, h++) {
				dpTab[l][h] = (str.charAt(l) == str.charAt(h)) ? dpTab[l+1][h-1] : (Math.min(dpTab[l][h - 1], dpTab[l + 1][h]) + 1);
			}
		}
		return dpTab[0][n - 1];
	}

	public static void main(String[] args) {
		String s = "abcd";
		System.out.println(getMinInsertion(s, 0, s.length() - 1));
		System.out.println(getMinInsertionDP(s));

	}

}
