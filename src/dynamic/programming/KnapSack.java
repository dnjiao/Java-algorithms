package dynamic.programming;

public class KnapSack {
	
	int[][] knapsack(int n, int W, int[] wt, int[] val) {
		int[][] ks = new int[n + 1][W + 1];
		
		ks[0][0] = 0;
		
		for (int i = 0; i <= n; i++) {
			for (int w = 0; w <= w; w++) {
				if (i == 0 && w == 0) ks[i][w] = 0;
				else if (wt[i - 1] < w) {
					return 
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
