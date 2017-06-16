package indeed;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstUniqueChar {
	
	public static void findFirstUniqueChar(String s) {
		char[] chars = s.toCharArray();
		
		Set<Character> dup = new HashSet<Character>();
		Map<Character, Integer> unique = new LinkedHashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			if (dup.contains(chars[i])) {
				if (unique.get(chars[i]) != null) {
					unique.remove(chars[i]);
				}
			} else {
				dup.add(chars[i]);
				unique.put(chars[i], i);
			}
		}
		
		if (!unique.isEmpty())
			System.out.println(unique.entrySet().iterator().next().getKey() + " " + unique.entrySet().iterator().next().getValue());
	}

	public static void main(String[] args) {
		String s = "dafkdadjfadifcz;cf8a90d0q2j1olkjlkac8izocyvu7ahpouhfadihn;kjnaca";
		findFirstUniqueChar(s);

	}

}
