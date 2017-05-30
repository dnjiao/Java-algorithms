package tree;

public class MinimumHeight {
	
	static class Node {
		int data;
		Node left;
		Node right;
		
		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
		
	}
	
	int findMinHeight(Node node) {
		if (node == null) return 0;
		if (node.left == null && node.right == null) return 1;
		
		if (node.left == null && node.right != null) return findMinHeight(node.right) + 1;
		else if (node.left != null && node.right == null) return findMinHeight(node.left) + 1;
		else {
			return Math.min(findMinHeight(node.left), findMinHeight(node.right)) + 1;
		}
	}

}
