package string;

import java.util.LinkedList;
import java.util.List;

public class StringPermutation {

	public static List<String> permute(String str) {
		List<String> list = new LinkedList<String>();
		if (str.length() == 1) {
			list.add(str);
			return list;
		}
		List<String> sublist = permute(str.substring(0, str.length() - 1));
		char lastCh = str.charAt(str.length() - 1);
		for (String s : sublist) {
			for (int i=0; i <= s.length(); i++) {
				StringBuilder sb = new StringBuilder(s);
				sb.insert(i, lastCh);
				list.add(sb.toString());
			}
		}                                                                                                                                                                                                                                                                                    
		return list;
		
	}
	public static void main(String[] args) {
		String s = "abcdefg";                                                                            
		List<String> list = permute(s);
		for (String str : list) {
			System.out.println(str);
		}

	}

}
