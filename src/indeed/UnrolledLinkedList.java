package indeed;
/**
 * An unrolled linked list is a variation on the linked list which stores multiple elements in each node. 
 * @author Oscar
 *
 */
public class UnrolledLinkedList {
	class ULLNode {
		int numElm;
		int[] array;
		ULLNode next;
		
		ULLNode(int size) {
			this.array = new int[size];
			this.next = null;
		}
	}
	
	ULLNode start;
	ULLNode end;
	int size;
	
	int nodeSize = 20;
	
	ULLNode get(int index) {
		if (index > size) {
			return null;
		}
		ULLNode runner = start;
		int i = 0;
		while (i < index) {
			i++;
			runner = runner.next;
		}
		return runner;
	}
	
	void insert(int val) {
		if (start == null) {
			start = new ULLNode(nodeSize);
			start.array[0] = val;
			start.numElm++;
			end = start;
		}
		if (end.numElm + 1 < nodeSize) {
			end.array[end.numElm++] = val;
		} else {
			ULLNode newNode = new ULLNode(nodeSize);
			newNode.array[0] = val;
			newNode.numElm++;
			end.next = newNode;
			end = newNode;
		}
		
	}

}
