package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DuplicateElementTwoArrays {

	public static <T> Set<T> findDupInArrays(T[] a, T[] b){
		Set<T> s1 = new HashSet<T>(Arrays.asList(a));
		Set<T> s2 = new HashSet<T>(Arrays.asList(b));
		Set<T> mutual = new HashSet<T>();
		
		Iterator<T> iter = s1.iterator();
		while (iter.hasNext()) {
			T obj = iter.next();
			if (s2.contains(obj)) {
				if (!mutual.contains(obj)) {
					mutual.add(obj);
				}
			}
		}
		return mutual;	
	}
	public static void main(String[] args) {
		String[] a = {"aaa", "bbb", "ccc", "ddd", "aaa", "ddd"};
		String[] b = {"ddd", "ccc", "eee", "fff", "ccc"};
		Set<String> m = findDupInArrays(a, b);
		m.forEach(s -> System.out.println(s));
		
	}

}
