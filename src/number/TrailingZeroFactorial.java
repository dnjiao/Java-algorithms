package number;

public class TrailingZeroFactorial {

	public static int countZeros(int n) {
		int count = 0;
		if (n < 0) {
			return -1;
		}
		for (int i = 5; i < n; i *= 5) {
			count += n / i;
		}
		return count;
	}
	public static int getFact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}
	public static void main(String[] args) {
		int num = 10;
		System.out.println(getFact(num));
		System.out.println(countZeros(num));

	}

}
