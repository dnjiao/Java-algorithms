package dynamic.programming;

/**
 * Problem: There are n houses built in a line, each of which contains some value in it.
 *  A thief is going to steal the maximal value in these houses, but he cannot steal in two adjacent houses 
 *  because the owner of a stolen house will tell his two neighbors on the left and right side. 
 *  What is the maximal stolen value?

For example, if there are four houses with values {6, 1, 2, 7}, the maximal stolen value is 13 when the first and fourth houses are stolen.
 * 
 * SOLUTION: f(i) = max(vi + f(i-2) if house i is stolen, f(i-1) otherwise)
 * @author Oscar
 *
 */
public class StolenValues {
	
	public static int maxStolenValues(int[] values) {
		if (values.length == 1) return values[0];
		if (values.length == 2) {
			return (values[0] > values[1]) ? values[0] : values[1];
		}
		
		int value1, value2, value = 0;
		value1 = values[0];
		value2 = (values[0] > values[1]) ? values[0] : values[1];
		for (int i = 2; i < values.length; i++) {
			int sum = values[i] + value1;
			value = (sum > value2) ? sum : value2;
			value1 = value2;
			value2 = value;
			
		}
		
		return value;
		
	}
	
	public static void main(String[] args) {
		int[] values = {6, 1, 2, 8, 4, 7};
		System.out.println(maxStolenValues(values));
	}
	

}
