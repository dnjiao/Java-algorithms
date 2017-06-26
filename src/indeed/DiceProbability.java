package indeed;

import java.util.Random;

public class DiceProbability {
	
	static double rollDice(int num, int total) {
		if (total > num * 6) {
			return 0.0;
		}
		Random rand = new Random();
		int[] dice = new int[num * 6];
		final int COUNT = 999999;
		for (int i = 0; i < COUNT; i++) {
			int sum = rand.nextInt(num * 6);
			dice[sum]++;
		}
		return (double)(dice[total - 1]) / COUNT;
	}

	public static void main(String[] args) {
		System.out.println(rollDice(2, 10));

	}

}
