package tree;
/**
 * Given a binary tree, print the nodes of binary tree grouped together in vertical order. 
 * Vertical order of a node is defined using its horizontal distance from the root node. 
 * Horizontal distance of root from itself is 0. Horizontal distance of right child of root node is +1 and horizontal distance of left child of root node is -1.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class VerticalOrder {
	
	class QueueEntry {
		Node node;
		int horDistance;
		
		QueueEntry(Node node, int distance) {
			this.node = node;
			this.horDistance = distance;
		}
	}
	
	Map<Integer, List<Node>> getVerticalDistance(Node root) {
		if (root == null) return null;
		Map<Integer, List<Node>> map = new TreeMap<Integer, List<Node>>();
		LinkedList<QueueEntry> queue = new LinkedList<QueueEntry>();
		QueueEntry rootEntry = new QueueEntry(root, 0);
		queue.add(rootEntry);
		
		while (!queue.isEmpty()) {
			QueueEntry entry = queue.remove();
			List<Node> list = new ArrayList<Node>();
			if(map.containsKey(entry.horDistance)) {
				list = map.get(entry.horDistance);
			}
			list.add(entry.node);
			map.put(entry.horDistance, list);
			
			if (root.left != null) {
				QueueEntry left = new QueueEntry(root.left, entry.horDistance - 1);
				queue.add(left);
			}
			
			if (root.right != null) {
				QueueEntry right = new QueueEntry(root.right, entry.horDistance + 1);
				queue.add(right);
			}
		}
		
		return map;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
