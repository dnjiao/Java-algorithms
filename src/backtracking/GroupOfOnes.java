package backtracking;
/**
 * Problem: Given a matrix with 1s and 0s, please find the number of groups of 1s. 
 * A group is defined by horizontally or vertically adjacent 1s. 
 * For example, there are four groups of 1s in Figure 1 which are drawn with different colors.
 */
import java.util.Stack;

public class GroupOfOnes {

	static class Position{
		int x;
		int y;
		
		Position(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	public static int findGroups(int[][] m) {
		int rows = m.length;
		int cols = m[0].length;
		
		if (rows == 0 || cols == 0) return -1;
		
		int groups = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (m[i][j] == 1) {
					groups++;
					flipAjacent(m, i, j);
				}
			}
		}
		
		return groups;
	}
	private static void flipAjacent(int[][] m, int i, int j) {
		int rows = m.length;
		int cols = m[0].length;
		
		Stack<Position> stack = new Stack<Position>();
		stack.push(new Position(i, j));
		
		while(!stack.empty()) {
			Position pos = stack.pop();
			if (rows > pos.x && m[pos.x + 1][pos.y] == 1) {
				m[pos.x + 1][pos.y] = 0;
				stack.push(new Position(pos.x + 1, pos.y));
			}
			if (cols > pos.y && m[pos.x][pos.y + 1] == 1) {
				m[pos.x][pos.y + 1] = 0;
				stack.push(new Position(pos.x, pos.y + 1));
			}
			if (pos.x > 0  && m[pos.x - 1][pos.y] == 1) {
				m[pos.x - 1][pos.y] = 0;
				stack.push(new Position(pos.x - 1, pos.y));
			}
			if (pos.y > 0 && m[pos.x][pos.y - 1] == 1) {
				m[pos.x][pos.y - 1] = 0;
				stack.push(new Position(pos.x, pos.y - 1));
			}
		}
		
	}
	public static void main(String[] args) {
		int[][] m = {{1, 1, 0, 0, 1}, {1,0,0,1,0}, {1,1,0,1,0}, {0,0,1,0,0}};
		System.out.println(findGroups(m));

	}

}
