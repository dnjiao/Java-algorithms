package tree;
/**
 * Check if a binary tree is a BST
 * @author Oscar
 *
 */
public class CheckBST {
	
	public static boolean isBST(Node node) {
		if (node == null) return true;
		if (node.left == null && node.right == null) return true;
		return isBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private static boolean isBST(Node node, int min, int max) {
		if (node.data > max || node.data < min) return false;
		if (isBST(node.left, min, node.data) && isBST(node.right, node.data, max)) 
			return true;
		return false;
	}
	
	

}
