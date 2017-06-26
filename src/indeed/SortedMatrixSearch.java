package indeed;

public class SortedMatrixSearch {
	
	static void findInSortedMatrix(int[][] mat, int t) {
		int r = 0;
		int c = mat[0].length - 1;
		
		while (r < mat.length && c >= 0) {
			if (mat[r][c] == t) {
				System.out.println("number " + t + " found at " + r + ", " + c);
				return;
			}
			if (mat[r][c] > t) {
				c--;
			} else {
				r++;
			}
		}
		System.out.println("number not found in matrix");
	}

	public static void main(String[] args) {
		int[][] m = { {15, 20, 40, 85},
					  {20, 35, 80, 95},
					  {30, 55, 95, 105},
					  {40, 80, 100, 120}};
		
		findInSortedMatrix(m, 30);
		// TODO Auto-generated method stub

	}

}
