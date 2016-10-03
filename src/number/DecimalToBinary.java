package number;

public class DecimalToBinary {

	private static int[] decToBin(int num) {
		int[] binary = new int[8];
		int index = 7;
		while(num != 0) {
			binary[index] = num % 2;
			index --;
			num = num / 2;
		}
		for (int i = index; i>=0; i --) {
			binary[i] = 0;
		}
		return binary;
		
		
	}
	public static void main(String[] args) {
		int num = 12;
		int[] bin = decToBin(num);
		for (int i = 0; i < 8; i ++) {
			System.out.print(bin[i]);
		}
	}

}
