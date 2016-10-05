package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MostWordsInFile {

	public static Map<String, Integer> getWordCount(String filepath) {
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		Scanner sc = null;
		try {
			sc = new Scanner(new File(filepath));
			while (sc.hasNext()) {
				String word = sc.next();
				if (wordMap.containsKey(word)) {
					wordMap.put(word, wordMap.get(word) + 1);
				} else {
					wordMap.put(word, 1);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
		return wordMap;
	}
	
	public static List<Entry<String, Integer>> sortMapByValue(Map map) {
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
				return -e1.getValue().compareTo(e2.getValue());
			}
		});
		
		return list;
		
	}
	public static void main(String[] args) {
		String filepath = "C:/Users/Oscar/Desktop/wordcount.txt";
		Map<String, Integer> map = getWordCount(filepath);
		List<Entry<String, Integer>> list = sortMapByValue(map);
		for (Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		
	}

}
