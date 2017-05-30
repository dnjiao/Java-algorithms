package dynamic.programming;

/**
 * A board has n*m cells, and there is a gift with some value (value is greater than 0) in every cell. 
 * You can get gifts starting from the top-left cell, and move right or down in each step, and finally reach the cell at the bottom-right cell. 
 * What¡¯s the maximal value of gifts you can get from the board?
 * 
 * 
 * SOLUTION: val[i][j] = max(val[i-1][j], val[i][j-1]) + m[i][j]
 * @author Oscar
 *
 */

public class GiftValues {
	public static int maxGiftValues(int[][] mat) {
		int cols = mat[0].length;
		int rows = mat.length;
		
		int[][] max = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				int left = 0;
				int up = 0;
				
				if (i > 0) 
					up = max[i - 1][j];
				
				if (j > 0) 
					left = max[i][j - 1];
				
				max[i][j] = (up > left) ? up + mat[i][j] : left + mat[i][j];
				
			}
		}
		
		return max[rows - 1][cols - 1];
	}

}
