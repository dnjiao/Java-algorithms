package facebook;

import java.util.Arrays;
import java.util.List;

/**
 * Given phrases, calculate average lenght of word
 *
 * @author Dian Jiao
 *
 */
public class WordLength {

	/**
	 * @param args
	 */
	
	public static float getAvgLengthOfWords(List<String> strings) {
		int count = 0;
		int runningLength = 0;
		for (String s : strings) {
			count++;
			int len = s.length();
			runningLength += len;
			System.out.println(s + ": " + len);
		}
		
		strings.forEach(s -> {
			System.out.println(s.length());
		});
		if (count == 0)
			System.err.println("No words are provided");
		return (float)runningLength / count;
	}
	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("me", "you", "him", "her", "them");
		float avgLen = getAvgLengthOfWords(strings);
		System.out.println("Average of word length is: " + avgLen);

	}

}
