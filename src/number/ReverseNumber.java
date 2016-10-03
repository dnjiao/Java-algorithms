package number;

public class ReverseNumber {

	public static int reverseNumber(int num) {
		int revNum = 0;
		int newNum = num;
		while (newNum != 0) {
			revNum *= 10;
			revNum += newNum % 10;
			newNum = newNum / 10;
		}
		return revNum;
		
	}
	public static void main(String[] args) {
		int num = 1230;
		int rev = reverseNumber(num);
		System.out.println(rev);
	}

}
