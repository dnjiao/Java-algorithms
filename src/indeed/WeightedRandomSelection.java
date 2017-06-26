package indeed;

import java.util.Arrays;
import java.util.Random;

public class WeightedRandomSelection {
	
	static String randomPick (String[] words, int[] weights) {
		int sum = Arrays.stream(weights).sum();
		Random rand = new Random();
		int pick = rand.nextInt(sum);
		int right = 0;
		int left = 0;
		String word = "";
		for (int i = 0; i < weights.length; i++) {
			right += weights[i];
			if (pick < left || pick > right) {
				left = right;
				continue;
			}
			word = words[i];
			
		}
		return word;
	}

}
