package string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given a dictionary of words and a string of characters, find if the string of characters can be broken into individual valid words from the dictionary.
Example: 
Dictionary: arrays, dynamic, heaps, IDeserve, learn, learning, linked, list, platform, programming, stacks, trees
String    : IDeservelearningplatform
Output   : true 
Because the string can be broken into valid words: IDeserve learning platform
 * @author Oscar
 *
 */
public class WordBreak {
	
	static boolean hasValidWords(Set<String> dict, String s) {
		boolean[] flags = new boolean[s.length()];
		
		for (int i = 0; i < s.length(); i++) {
			if (dict.contains(s.substring(0, i + 1)))
				flags[i] = true;
			if (flags[i] == true) {
				if (i == s.length() - 1)
					return true;
				else {
					for (int j = i + 1; j < s.length(); j++) {
						if (dict.contains(s.substring(i, j + 1)))
							flags[j] = true;
						if (flags[j] == true && j == s.length() - 1) 
							return true;
					}
				}
			}
				
		}
		return false;
	}

	public static void main(String[] args) {
		final Set<String> dict = new HashSet<String>((Arrays.asList("arrays", "dynamic", "heaps", 
				"IDeserve", "learn", "learning", "linked", "list", "platform", "programming", "stacks", "trees")));
		System.out.println(hasValidWords(dict, "IDeservelearningplatform"));

	}

}
