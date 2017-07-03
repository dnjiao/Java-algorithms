package tree;
/**
 * Two elements of a binary search tree (BST) are swapped by mistake. Restore the BST structure without changing positions of nodes which are correctly placed.
 * @author Oscar
 *
 */
public class TwoNodesSwapBST {
	
	Node firstStartNode, lastEndNode;
	Node prevNode, currNode;
	
	void findWrongNodes(Node root) {
		if (root == null) return;
		findWrongNodes(root.left);
		if (prevNode != null) {
			if (prevNode.data > root.data) {
				if (firstStartNode == null) {
					firstStartNode = prevNode;
				}
				lastEndNode = root;
			}
		
		}
		prevNode = root;
		findWrongNodes(root.right);
	}
	
	void recoverTree(Node root) {
		findWrongNodes(root);
		int data = firstStartNode.data;
		firstStartNode.data = lastEndNode.data;
		lastEndNode.data = data;
		
	}

}
