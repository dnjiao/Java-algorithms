package amazon;

public class BSTDistance {

	// class of BST node]
		 class Node {

			private int data;
			private Node left;
			private Node right;

			public  Node(int num) {
				this.data = num;
				this.left = null;
				this.right = null;
			}
			
			public void addNode(int num) {
				if (num < this.data) {
					if (this.left != null) {
						this.left.addNode(num);
					} else {
						this.left = new Node(num);
					}
				} else {
					if (this.right != null) {
						this.right.addNode(num);
					} else {
						this.right = new Node(num);
					}
				}
			}
			public boolean search(int value) {
	            if (value == this.data)
	                  return true;
	            else if (value < this.data) {
	                  if (left == null)
	                        return false;
	                  else
	                        return left.search(value);
	            } else if (value > this.data) {
	                  if (right == null)
	                        return false;
	                  else
	                        return right.search(value);
	            }
	            return false;
	      }
		}
		 
		 public  Node createBST(int[] values, int n) {
				Node tree = new Node(values[0]);
				for (int i = 1; i < n; i++) {
					tree.addNode(values[i]);
				}
				return tree;
			}
		// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
		public  int bstDistance(int[] values, int n, int node1, int node2)
		{
			Node tree = createBST(values, n);
			int distance = -1;
			if (tree.search(node1) || tree.search(node2)) {
				distance = findDistance(tree, node1, node2);
			}
			return distance;
		}
		public static int findDistance(Node root, int n1, int n2) {
			int x = Pathlength(root, n1) - 1;
			int y = Pathlength(root, n2) - 1;
			int lcaData = findLCA(root, n1, n2).data;
			int lcaDistance = Pathlength(root, lcaData) - 1;
			return (x + y) - 2 * lcaDistance;
		}

		public static int Pathlength(Node root, int n1) {
			if (root != null) {
				int x = 0;
				if ((root.data == n1) || (x = Pathlength(root.left, n1)) > 0
						|| (x = Pathlength(root.right, n1)) > 0) {
					return x + 1;
				}
				return 0;
			}
			return 0;
		}

		public static Node findLCA(Node root, int n1, int n2) {
			if (root != null) {
				if (root.data == n1 || root.data == n2) {
					return root;
				}
				Node left = findLCA(root.left, n1, n2);
				Node right = findLCA(root.right, n1, n2);

				if (left != null && right != null) {
					return root;
				}
				if (left != null) {
					return left;
				}
				if (right != null) {
					return right;
				}
			}
			return null;
		}

			
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
