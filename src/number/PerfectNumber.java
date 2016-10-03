package number;

public class PerfectNumber {
	//A perfect number is a positive integer 
	//that is equal to the sum of its proper 
	//positive divisors, that is, the sum of its 
	//positive divisors excluding the number itself. 
	//Equivalently, a perfect number is a number 
	//that is half the sum of all of its positive divisors

	private static void findPerfectNumbers(int num) {
		for (int i=1; i<= num; i++) {
			if(isPerfectNumber(i)) {
				System.out.println(i);
			}
		}
	}
	private static boolean isPerfectNumber(int num) {
		int sum = 0;
		for (int i=1; i <= num/2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		if (num == sum) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		int num = 1000;
		findPerfectNumbers(num);
	}

}
