package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DupCharInString {

	public static void deDupString(String str) {
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (int i=0; i<str.length() - 1; i++){
			char ch = str.charAt(i);
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}
		Set<Character> keys = charMap.keySet();
		for (char key : keys) {
			if (charMap.get(key) > 1) {
				System.out.println(key + ": " + charMap.get(key));
			}
		}
		
	}
	public static void main(String[] args) {
		String str = "kjdakfjioque$@ijakjvlk;jp9jihnzjknvojqih_dafkdjfkajdkf";
		deDupString(str);

	}

}
