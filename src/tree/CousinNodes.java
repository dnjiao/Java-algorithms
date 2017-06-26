package tree;
/**
 * Given two nodes in a binary tree, check if they are cousins.
Two nodes are cousins if: 
1: they are not siblings (children of same parent).
2: they are on the same level.
 * @author Oscar
 *
 */
public class CousinNodes {
	
	Node root;
	
	boolean isCousin(Node a, Node b) {
		if (getLevel(a) != getLevel(b)) 
			return false;
		return isSibling(a, b) ? false : true;
		
	}

	private int getLevel(Node a) {
		return getLevel(root, a, 1);
	}
	

	private int getLevel(Node root, Node a, int currLevel) {
		if (root == null) {
			return 0;
		}
		if (root == a) {
			return currLevel;
		}
		
		int level = getLevel(root.left, a, currLevel + 1);
		if (level != 0) return level;
		else
			level = getLevel(root.right, a, currLevel + 1);
		return level;
	}
	
	private boolean isSibling(Node a, Node b) {
		return isSibling(root, a, b);
	}

	private boolean isSibling(Node root, Node a, Node b) {
		if (root == null)
			return false;
		return ((root.left == a && root.right == b) || (root.left == b && root.right == a)
				|| isSibling(root.left, a, b) || isSibling(root.right, a, b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
