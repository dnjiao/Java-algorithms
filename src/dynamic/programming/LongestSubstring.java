package dynamic.programming;

/**
 * Problem: Given a string, please get the length of the longest substring which does not have duplicated characters. 
 * Supposing all characters in the string are in the range from ¡®a¡¯ to ¡®z¡¯.
 * 
 * 
 * SOLUTIONS:If the ith character has not appeared before, L(i) should be L(i-1)+1. 
 * It¡¯s more complex when the ith character is duplicated. 
 * Firstly we get the distance between the ith character and its previous occurrence. 
 * If the distance is greater than L(i-1), the character is not in longest substring without 
 * duplication ending with the (i-1)th character, so L(i) should also be L(i-1)+1. 
 * If the distance is less than L(i-1), L(i) is the distance, and 
 * it means between the two occurrence of the ith character there are no other duplicated characters.
 * 
 * @author Oscar
 *
 */
public class LongestSubstring {
	
	public static int longestSub(String str) {
		
		int curLen = 0;
		int maxLen = 0;
		
		int[] positions = new int[26];
		for (int i = 0; i < 26; i++) {
			positions[i] = -1;
		}
		
		for (int i = 0; i < str.length(); i++){
			int prev = positions[str.charAt(i) - 'a'];
			
			if (prev < 0 && i - prev > curLen) {
				curLen++;
			} else {
				if (curLen > maxLen) {
					maxLen = curLen;
				}
				curLen = i - prev;
			}
			
			positions[str.charAt(i) - 'a'] = i;
		}
		
		if (curLen > maxLen) maxLen = curLen;
		return maxLen;
	}

	public static void main(String[] args) {
		String s = "aaa";
		System.out.println(longestSub(s));
		// TODO Auto-generated method stub

	}

}
