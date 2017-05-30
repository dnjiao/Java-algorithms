package list;

public class ReverseLinkedList {

	Node head;
	static class Node {
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	private void add(int val) {
		Node newNode = new Node(val);
		Node tmp = head;
		while (true) {
			if (head == null) {
				head = newNode;
				break;
			} else if (tmp.next == null) {
				tmp.next = newNode;
				break;
			} else {
				tmp = tmp.next;
			}
		}
	}
	
	private void print() {
		Node tmp = head;
		while (true) {
			if (tmp == null) {
				break;
			}
			System.out.println(tmp.data);
			tmp = tmp.next;
		}
	}
	
	private void reverse() {
		Node prev = null;
		Node current = head;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
	
	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		for (int i=0; i<10; i++) {
			list.add(i);
		}
		list.print();
		list.reverse();
		list.print();

	}

}
