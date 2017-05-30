package dynamic.programming;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

/**
 * Problem: Implement a function which gets the edit distance of two input strings. 
 * There are three types of edit operations: insertion, deletion and substitution. 
 * Edit distance is the minimal number of edit operations to modify a string from one to the other.

For example, the edit distance between ¡°Saturday¡± and ¡°Sunday¡± is 3, since the following three edit operations are required to modify one into the other:
1.       Saturday ¡ú Sturday (deletion of ¡®a¡¯)
2.       Sturday¡ú Surday (deletion of ¡®t¡¯)
3.       Surday ¡ú Sunday (substitution of ¡®n¡¯ for ¡®r¡¯)

There is no way to achieve it with fewer than three operations.
 * @author Oscar
 *
 */
public class StringDistance {
	
	public static int getDistance(String str1, String str2) {
		char[] a = str1.toCharArray();
		char[] b = str2.toCharArray();
		
		int[][] distance = new int[a.length][b.length];
		
		for (int i = 0; i < a.length; i++) distance[i][0] = i;
		for (int j = 0; j < b.length; j++) distance[0][j] = j;
		
		int del, ins, sub;
		for (int i = 1; i < a.length; i++) {
			for (int j = 1; j < b.length; j++) {
				if (a[i] == b[j]) distance[i][j] = distance[i-1][j-1];
				else {
					del = distance[i][j - 1] + 1;
					ins = distance[i-1][j] + 1;
					sub = distance[i-1][j-1] + 1;
					List list = Arrays.asList(del, ins, sub);
					distance[i][j] = Collections.min(list);
				}
			}
		}
		return distance[a.length-1][b.length-1];
	}
	
	public static void main(String[] args) {
		String s1 = "Saturday";
		String s2 = "Sundayxxx";
		
		System.out.println(getDistance(s1,s2));
	}

}
