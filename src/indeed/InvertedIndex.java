package indeed;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class InvertedIndex {
	
	static Map<String, TreeMap<Integer, Integer>> inverIndex(List<List<String>> docs) {
		Map<String, TreeMap<Integer, Integer>> wordMap = new TreeMap<String, TreeMap<Integer, Integer>>();
		for (int i = 0; i < docs.size(); i++) {
			for (String word : docs.get(i)) {
				if (wordMap.containsKey(word)) {
					Map<Integer, Integer> docMap = wordMap.get(word);
					if (docMap.containsKey(i)) {
						docMap.put(i, docMap.get(i) + 1);
					}
					else {
						docMap.put(i, 1);
					}
				}
			}
		}
		return wordMap;
	}
	
	void printWordMap(Map<String, TreeMap<Integer, Integer>> map) {
		for (Map.Entry<String, TreeMap<Integer, Integer>> e : map.entrySet()) {
			printWordIndex(e);
		}
	}

	private void printWordIndex(Entry<String, TreeMap<Integer, Integer>> e) {
		TreeMap<Integer, Integer> tm = e.getValue();
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<Integer, Integer> en : tm.entrySet()) {
			sb.append(en.getKey()).append(", ");
			count += en.getValue();
		}
		
		System.out.println(e.getKey() + "\t" + sb.toString() + "\t" + count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
