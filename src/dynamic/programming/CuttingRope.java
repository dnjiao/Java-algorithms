package dynamic.programming;

/**
 * Problem: Given a rope with length n, how to cut the rope into m parts with length n[0], n[1], ..., n[m-1], 
 * in order to get the maximal product of n[0]*n[1]* ... *n[m-1]? 
 * We have to cut once at least. Additionally, the length of the whole length of the rope, as well as 
 * the length of each part, are in integer value.

For example, if the length of the rope is 8, the maximal product of the part lengths is 18. 
In order to get the maximal product, the rope is cut into three parts with lengths 2, 3, and 3 respectively.

 *SOLUTION: f(n)=max(f(i)*f(n-i), where 0<i<n).
 * 
 * @author Oscar
 *
 */
public class CuttingRope {
	
	public static int maxProduct(int len) {
		if (len == 0) return 0;
		if (len == 1) return  1;
		if (len == 2) return 2;
		if (len == 3) return 3;
		
		int[] products = new int[len + 1];
		products[0] = 0;
		products[1] = 1;
		products[2] = 2;
		products[3] = 3;
		
		for (int i = 4; i <= len; i++) {
			int max = Integer.MIN_VALUE;
			for (int j = 1; j <= i/2; j++) {
				int prod = products[j] * products[i - j];
				if (prod > max) {
					max = prod;
				}
			}
			products[i] = max;
		}
		
		return products[len];
	}

	public static void main(String[] args) {
		System.out.println(maxProduct(8));

	}

}
