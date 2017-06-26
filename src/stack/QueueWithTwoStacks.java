package stack;

import java.util.Stack;

public class QueueWithTwoStacks<T> {
	Stack<T> oldStack;
	Stack<T> newStack;
	
	QueueWithTwoStacks() {
		oldStack = new Stack<T>();
		newStack = new Stack<T>();
	}
	void shiftStacks() {
		if (oldStack.isEmpty()) {
			while (!newStack.isEmpty()) {
				oldStack.push(newStack.pop());
			}			
		}
	}
	
	void enQueue(T t) {
		shiftStacks();
		newStack.push(t);
	}
	
	T deQueue() {
		shiftStacks();
		return oldStack.pop();
	}

	public static void main(String[] args) {
		QueueWithTwoStacks<Integer> queue = new QueueWithTwoStacks<Integer>();
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		queue.enQueue(5);
		queue.enQueue(6);
		System.out.println(queue.deQueue());
		queue.enQueue(8);
		queue.enQueue(10);
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());

	}

}
