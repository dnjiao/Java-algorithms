package dynamic.programming;

/**
 * Problem: Please implement a function which gets the minimal number of coins, 
 * whose value is v1, v2, бн, vn, to make change for an amount of money with value t. 
 * Any coin with value vi may duplicate for any times to make change.

For example, the minimal number of coins to make change for 15 out of a set of coins 
with value 1, 3, 9, 10 is 3. We can choose two coins with value 3 and a coin with value 9. 
The number of coins for other choices should be greater than 3.

* SOLUTION: f(t) = min(f(t-v_i)) + 1 (0< i <n)
 * @author Oscar
 *
 */
public class CoinChange {
	
	public static int getCoinChange(int total, int[] coins) {
		int[] counts = new int[total + 1];
		counts[0] = 0;
				
		for (int i = 1; i <= total; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < coins.length; j++) {
				if (i >= coins[j] && counts[i - coins[j]] < min) {
					min = counts[i - coins[j]];
				}
			}
			
			counts[i] = min + 1;
			
		}
		
		return counts[total];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
