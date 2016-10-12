package number;

public class BinaryChecker {

	public boolean isBinary(int num) {
		String str = Integer.toString(num);
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i) != '0' && str.charAt(i) != '1') {
				return false;
			}
			
		}
		return true;
	}
	public static void main(String[] args) {
		int num1 = 301020;
		int num2 = 1111010;
		BinaryChecker bc = new BinaryChecker();
		System.out.println("num1 " + bc.isBinary(num1));
		System.out.println("num2 " + bc.isBinary(num2));
		

	}

}
