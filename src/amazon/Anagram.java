package amazon;
/**
 * Given a text txt[0..n-1] and a pattern pat[0..m-1], 
 * write a function search(char pat[], char txt[]) that prints all occurrences of pat[] 
 * and its permutations (or anagrams) in txt[]. You may assume that n > m. 
 */
import java.util.ArrayList;
import java.util.List;

public class Anagram {
  	public static List<Integer> getAnagramIndices(String haystack, String needle)
	{
	    List<Integer> list = new ArrayList<Integer>();
	    
		int n = haystack.length();
		int m = needle.length();
		if (n < m || m == 0) return null;
		int textHist[] = new int[256];
		int patHist[] = new int[256];
	
//		//initial histogram window of size m 
		int i = 0;
		for(i = 0; i < m; i++){
			patHist[needle.charAt(i)]++;
			textHist[haystack.charAt(i)]++;
		}
	
//		//search the pattern histogram in a sliding window of text histogram
		do{
		
			if(equalHistogram(textHist, patHist)){
				list.add(i - m);
			}
//			
//			//slide the text histogram window by 1 position to the right and check for anagram
			textHist[haystack.charAt(i)]++;
			textHist[haystack.charAt(i-m)]--;
		} while(++i < n);
	    
	    return list;
	}
	
	private static boolean equalHistogram(int[] hist1, int[] hist2){
		for(int i = 0; i < hist1.length; i++){
			if(hist1[i] != hist2[i]){
				return false;
			}
		}
	
	    return true;
	}
	
	public static void main(String[] args) {
		String str = "bbbababaaabbb";
		String s2 = "ab";
		
		List<Integer> list = getAnagramIndices(str, s2);
		
		for (Integer i : list) {
			System.out.println(i);
		}
		
	}
}
