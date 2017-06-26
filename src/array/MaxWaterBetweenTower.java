package array;
/**
 * We have an array where each element represents height of a tower. 
 * If it starts raining, what is the amount of water that can be collected between the towers? 
 * Assumption is that the width of every tower is 1.
Example:
Input  - {1,5,2,3,1,7,2}
Output - 11
 * @author Oscar
 *
 */
public class MaxWaterBetweenTower {
	
	static int maxWaterTrapped(int[] t) {
		int[] maxRight = new int[t.length];
		int maxCurr = Integer.MIN_VALUE;
		int maxLeft = 0;
		
		int water = 0;
		for (int i = t.length - 1; i >= 0; i--) {
			if (t[i] > maxCurr) 
				maxCurr = t[i];
			
			maxRight[i] = maxCurr;

		}
		
		for (int i = 0; i < t.length - 1; i++) {
			if (maxLeft > t[i] && maxRight[i] > t[i]) {
				water += maxLeft > maxRight[i] ? maxRight[i] - t[i] : maxLeft - t[i];
			}
			if (t[i] > maxLeft) maxLeft = t[i];
		}
		return water;
	}

	public static void main(String[] args) {
		int[] towerHeight = { 1, 5, 2, 3, 1, 7, 2, 4 };
        System.out.println(maxWaterTrapped(towerHeight));
    }
}
