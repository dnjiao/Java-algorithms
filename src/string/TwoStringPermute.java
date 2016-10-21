package string;

import java.util.Arrays;

public class TwoStringPermute {
// If two strings are permutations
	
	public static String sortString(String str) {
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}
	public static void main(String[] args) {
		String str1 = "iozqic";
		String str2 = "zoiicq";
		System.out.println(sortString(str1));
		System.out.println(sortString(str2));
		if (sortString(str1).equals(sortString(str2))) {
			System.out.println("Two strings are permutations");
		} else {
			System.out.println("They are not permutations");
		}

	}

}
