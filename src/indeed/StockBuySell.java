package indeed;

import java.util.ArrayList;
import java.util.List;

public class StockBuySell {
	static class Period {
		int buy;
		int sell;
	}

	static int maxGainOneTransac(int[] arr) {
		
		int min = arr[0];
		int gain = 0;
	
		for (int i = 1; i < arr.length; i++) {
			if (gain < arr[i] - min) {
				gain = arr[i] - min;
			}
			if (min > arr[i])
				min = arr[i];
		}
		
		return gain;

	}
	
	static void maxGainMultiTransac(int[] arr) {
		int n = arr.length;
		if (n == 1) return;
		
		List<Period> pairs = new ArrayList<Period>();
		int i = 0;
		while (i < n - 1) {
			while (i < n - 1 && arr[i] > arr[i + 1]) 
				i++;
			if (i == n - 1) break;
			Period p = new Period();
			p.buy = i++;
			
			while (i < n && arr[i] > arr[i - 1]) 
				i++;
			
			p.sell = i - 1;
			pairs.add(p);
			
		}
		
		if (pairs.size() == 0) return;
		for (Period p : pairs) {
			System.out.println(p.buy + " " + p.sell);
		}
	}
	
	public static void main(String[] args) {
		int[] stocks = new int[] {100, 80, 90, 120, 130, 70, 60, 74, 80, 105, 117};
		System.out.println(maxGainOneTransac(stocks));
		maxGainMultiTransac(stocks);

	}

}
