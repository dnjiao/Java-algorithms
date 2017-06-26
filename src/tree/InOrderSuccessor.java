package tree;
/**
 * In the in-order traversal for a given node 'n', we visit n.left, then 'n', then n.right.
Therefore, if we want to find the in-order successor of node 'n', we do the following:
1. First notice that because of the order in which we visit nodes, if 'n' has a right child, 
then the successor must be on the right side of 'n. Specifically, immediately after visit of node 'n', 
the left-most child in the right sub-tree of node 'n' will be visited.
2. If node 'n' does not have right child then - 
        a. If 'n' is a left child of its parent(parent.left == 'n'), then parent is the in-order successor of 'n';
        b. If 'n' is a right child of its parent(parent.right == 'n'), then we keep on searching 
        for in-order successor by updating  'n' to parent until we find that 'n' is a left child of its parent. At this point we return parent(same as step 'a').
 * @author Oscar
 *
 */
public class InOrderSuccessor {
	Node findInOrderSuccessor (Node node) {
		if (node == null) return null;
		
		// If node is leaf
		if (node.right != null) {
			return getLeftMostChild(node.right);
		} 
		if (node.parent.left == node)
			return node.parent;
		else {
			while (true) {
				Node parent = node.parent;
				if (parent.left == node) {
					return parent;
				}
				node = parent;
			}
		}
	}

	private Node getLeftMostChild(Node node) {
		if (node == null)
			return null;
		while (node.left != null) {
			node = node.left;
		}
		return node;
	}
	
	class Node {
		Node left, right, parent;
		int data;
	}

}
