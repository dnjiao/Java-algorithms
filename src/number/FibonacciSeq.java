package number;

public class FibonacciSeq {

	public int fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
	public static void main(String[] args) {
		FibonacciSeq fib = new FibonacciSeq();
		for (int i=0; i<20; i++) {
			System.out.println(fib.fibonacci(i));
		}
	}

}
