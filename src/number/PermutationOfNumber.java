package number;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//Given a numbers, return all possible permutations.
public class PermutationOfNumber {
	class Solution {
		
		// recursively solve this problem. Swap each element with each element after it.
	    public int solution(int N) {
	        int[] arr = numToArray(N);
	        ArrayList<ArrayList<Integer>> list = permute(arr);
	        Set<ArrayList<Integer>> hs = new HashSet<>();
	        hs.addAll(list);
	        return hs.size();
	    }
	    
	    public ArrayList<ArrayList<Integer>> permute(int[] num) {
	    	ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	    	permute(num, 0, list);
	    	return list;
	    }
	     
	    void permute(int[] num, int start, ArrayList<ArrayList<Integer>> list) {
	     
	    	if (start >= num.length) {
	    		ArrayList<Integer> item = convertArrayToList(num);
	    		list.add(item);
	    	}
	     
	    	for (int j = start; j <= num.length - 1; j++) {
	    		swap(num, start, j);
	    		permute(num, start + 1, list);
	    		swap(num, start, j);
	    	}
	    }
	     
	    private ArrayList<Integer> convertArrayToList(int[] num) {
	    	ArrayList<Integer> item = new ArrayList<Integer>();
	    	for (int h = 0; h < num.length; h++) {
	    		item.add(num[h]);
	    	}
	    	return item;
	    }
	     
	    private void swap(int[] a, int i, int j) {
	    	int temp = a[i];
	    	a[i] = a[j];
	    	a[j] = temp;
	    }
	    
	    private int[] numToArray(int num) {
	        String str = Integer.toString(num);
	        int[] arr = new int[str.length()];
	        for (int i = 0; i < str.length(); i++)
	        {
	            arr[i] = str.charAt(i) - '0';
	        }
	        return arr;
	    }
	}
}
