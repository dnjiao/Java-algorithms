package math;

public class MathOpsWithAdding {
	
	public static int substract(int a, int b) {
		return a + negate(b);
	}
	
	public static int multiply(int a, int b) {
		if (a < b) {
			return multiply(b, a);
		}
		
		int sum = 0;
		for (int i = 1; i <= abs(b); i++) {
			sum += abs(a);
		}
		if (a < 0 && b < 0 || a > 0 && b > 0) {
			return sum;
		}
		return negate(sum);
	}
	
	public static int divide(int a, int b) {
		if (b == 0) {
			System.err.println("Can't divide zero");
			System.exit(1);
		}
		
		int sum = 0;
		int result = 0;
		int absa = abs(a);
		int absb = abs(b);
		if (absa < absb) {
			return 0;
		}
		while (absa >= sum + absb) {
			sum += absb;
			result++;
		}
		if (multiply(a, b) > 0) {
			return result;
		}
		return negate(result);
	}
	public static int negate(int a) {
		int neg = 0;
		int d = a < 0 ? 1 : -1;
		while (a != 0) {
			neg += d;
			a += d;
		}
		return neg;
	}
	public static int abs(int a) {
		if (a >= 0) {
			return a;
		} else {
			return negate(a);
		}
	}
	

	public static void main(String[] args) {
		int a = 19;
		int b = 5;
		System.out.println(divide(a, b));

	}

}
