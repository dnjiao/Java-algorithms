package indeed;
/**
 * we can use a max heap on left side to represent elements that are less than effective median, 
 * and a min heap on right side to represent elements that are greater than effective median.

 * After processing an incoming element, the number of elements in heaps differ utmost by 1 element. 
 * When both heaps contain same number of elements, we pick average of heaps root data as effective median. 
 * When the heaps are not balanced, we select effective median from the root of heap containing more elements.
 */
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class RunningMedianOfArray {
	
	Queue<Integer> minHeap;
	Queue<Integer> maxHeap;
	int numOfElem;
	
	RunningMedianOfArray() {
		this.minHeap = new PriorityQueue<Integer>();
		this.maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
		this.numOfElem = 0;
	}
	
	void addNumberToArray(int n) {
		this.maxHeap.add(n);
		if (this.numOfElem % 2 == 0) {
			if (minHeap.isEmpty()) {
				this.numOfElem++;
				return;
			} else {
				// If newly added number in maxHeap is bigger than minHeap root
				// swap roots of heaps
				if (maxHeap.peek() > minHeap.peek()) {
					int maxRoot = maxHeap.poll();
					int minRoot = minHeap.poll();
					maxHeap.add(minRoot);
					minHeap.add(maxRoot);
					
				}
			}
		}
		else {
			minHeap.add(maxHeap.poll());
		}
		this.numOfElem++;
	}
	
	double getMedian() {
		if (this.numOfElem % 2 == 0) {
			return (double)(this.minHeap.peek() + this.maxHeap.peek()) / 2.0;
		}
			return new Double(this.maxHeap.peek());
	}

	public static void main(String[] args) {
		RunningMedianOfArray array = new RunningMedianOfArray();
		array.addNumberToArray(4);
		array.addNumberToArray(7);
		array.addNumberToArray(8);
		array.addNumberToArray(1);
		array.addNumberToArray(2);
		array.addNumberToArray(3);
		array.addNumberToArray(10);
		array.addNumberToArray(9);
		array.addNumberToArray(6);
		
		System.out.println(array.getMedian());

	}

}
