package list;

public class MergeSortList {
	
	static class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			next = null;
		}		
	}
	
	Node mergeSortList(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		
		Node p1 = head;
		Node p2 = head;
		
		while (p2 != null) {
			p1 = p1.next;
			p2 = p2.next.next;
		}
		
		Node h1 = mergeSortList(head);
		Node h2 = mergeSortList(p1);
		
		return mergeLists(h1, h2);
	}

	private Node mergeLists(Node h1, Node h2) {
		Node list = new Node(1);
		
		Node p1 = h1;
		Node p2 = h2;
		Node pNew = list;
		
		while (p1 != null || p2 != null) {
			if (p1 == null) {
				pNew.next = p2;
				p2 = p2.next;
			} else if (p2 == null) {
				pNew.next = p1;
				p1 = p1.next;
			} else {
				if (p1.data < p2.data) {
					pNew.next = p1;
					p1 = p1.next;
				} else {
					pNew.next = p2;
					p2 = p2.next;
				}
			}
		}
		return list.next;
	}
	
	

}
