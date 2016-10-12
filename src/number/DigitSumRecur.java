package number;

//find out sum of each digit in the given number using recursion logic. 
public class DigitSumRecur {

	int sum = 0;
	public int getDigitSum(int num) {	
		if (num == 0) {
			return 0;
		} else {
			sum += num % 10;
			getDigitSum(num / 10);
		}
		return sum;
	}
	public static void main(String[] args) {
		int num = 54890;
		DigitSumRecur sum = new DigitSumRecur();
		System.out.println(sum.getDigitSum(num));

	}

}
