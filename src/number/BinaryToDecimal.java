package number;

public class BinaryToDecimal {

	public int binToDec(int bin) {
		int num = 0;
		int power = 1;
		while(true) {
			if (bin == 0) {
				break;
			} else {
				int div = bin % 10;
				num += div * Math.pow(2, power);
				bin = bin / 10;
				power ++;
			}
		}
		return num;
	}
	public static void main(String[] args) {
		int bin1 = 110111;
		BinaryToDecimal btd = new BinaryToDecimal();
		System.out.println(btd.binToDec(bin1));

	}

}
