package tree;

public class BSTNodeDeletion {
	
	
	Node deleteNode(Node node, int key) {
		if (node == null) return null;
		
		if (key < node.data) {
			node.left = deleteNode(node.left, key);
		}
		else if (key > node.data) {
			node.right = deleteNode(node.right, key);
		}
		else { // key equal to node
			if (node.left == null) { // if no left child, copy right child value to current node
				node = node.right;
			} else if (node.right == null) {
				node = node.left;
			} else {
				int inOrderSuccessor = getMinValue(node.right);
				node.data = inOrderSuccessor;
				node.right = deleteNode(node.right, inOrderSuccessor);
			}
		}
		return node;
	}

	private int getMinValue(Node node) {
		if (node == null) return Integer.MIN_VALUE;
		if (node.left == null) return node.data;
		return getMinValue(node.left);
	}

}
