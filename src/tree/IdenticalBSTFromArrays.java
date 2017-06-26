package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IdenticalBSTFromArrays {
	static boolean isIdenticalBST(int[] a, int[] b) {
		if (a.length == 0 && b.length == 0) {
			return true;
		}
		
		if (a.length != b.length) 
			return false;
		
		if (a[0] == b[0]) 
			return false;
		
		List<Integer> listA =  new ArrayList<Integer>();
		List<Integer> listB =  new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			listA.add(a[i]);
			listB.add(b[i]);
		}
		
		return isIdenticalBST(listA, listB);
	}

	static boolean isIdenticalBST(List<Integer> listA, List<Integer> listB) {
		if (listA.size() != listB.size()) return false;
		if (listA.size() == 0 && listB.size() == 0) return true;
		if (listA.get(0) == listB.get(0)) {
			int root = listA.get(0);
			List<Integer> leftListA = new ArrayList<Integer>();
			List<Integer> rightListA = new ArrayList<Integer>();
			List<Integer> leftListB = new ArrayList<Integer>();
			List<Integer> rightListB = new ArrayList<Integer>();
			
			for (Integer a : listA) {
				if (a <= root) leftListA.add(a);
				else rightListA.add(a);
			}
			
			for (Integer b : listB) {
				if (b <= root) leftListB.add(b);
				else rightListB.add(b);
			}
		
			return (isIdenticalBST(leftListA, leftListB) && isIdenticalBST(rightListA, rightListB));
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] a = {3,5,4,6,1,0,2};
        
        int[] b = {3,1,5,2,4,6,0};
        
        System.out.println(isIdenticalBST(a, b));
	}

}
