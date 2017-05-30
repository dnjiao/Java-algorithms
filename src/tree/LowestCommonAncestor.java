package tree;
/**
 * The lowest common ancestor between two nodes n1 and n2 is defined as the lowest node in T that has both n1 and n2 as descendants
 * 
 * Computation of lowest common ancestors may be useful, for instance, 
 * as part of a procedure for determining the distance between pairs of nodes in a tree: 
 * the distance from n1 to n2 can be computed as the distance from the root to n1, 
 * plus the distance from the root to n2, 
 * minus twice the distance from the root to their lowest common ancestor
 * @author Oscar
 *
 */
public class LowestCommonAncestor {
	
	static class Node {
		int data;
		Node left;
		Node right;
		
		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
		
		Node lca(Node root, Node n1, Node n2) {
			if (root == null) return null;
			
			if (root.data > n1.data && root.data > n2.data) {
				return lca(root.left, n1, n2);
			}
			
			if (root.data < n1.data && root.data < n2.data) {
				return lca(root.right, n1, n2);
			}
			return root;
		}
	}

}
