package string;
/**
 * Reverse the order of words in a sentence, but keep words themselves unchanged. 
 * Words in a sentence are divided by blanks. For instance, 
 * the reversed output should be ¡°student. a am I¡± when the input is ¡°I am a student¡±.
 * @author Oscar
 *
 */
public class ReverseWordsInSentence {
	
	public static void reverseString(char[] chars, int begin, int end) {		
		while (begin <= end) {
			char tmp = chars[begin];
			chars[begin] = chars[end];
			chars[end] = tmp;
			begin++;
			end--;
		}
	}
	
	static char[] reverseWords(char[] chars) {
		reverseString(chars, 0, chars.length - 1);
		int begin = 0, end = 0;
		
		while (end < chars.length) {
			if (chars[begin] == ' ') {
				begin++;
				end++;
			} else if (chars[end] == ' ') {
				reverseString(chars, begin, end - 1);
				begin = end;
			} else {
					end++;
				
			}
		}
		
		return chars;
	}

	public static void main(String[] args) {
		String str = "I am a student";
		System.out.println(reverseWords(str.toCharArray()));
		

	}

}
