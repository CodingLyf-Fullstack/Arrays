package com.arrays;

public class BuyandSellStock {
	
	public static void main(String args[]) {
		int prices[] = {7, 1, 5, 3, 6, 4};
		int minPrice = prices[0];
		int maxProfit = 0;
		for(int i=1;i<prices.length;i++) {
			if(prices[i] < minPrice) {
				minPrice = prices[i];
			} else {
				maxProfit = Math.max(maxProfit, prices[i]-minPrice);
			}
		}
		System.out.println("maxProfit:- "+maxProfit);
	}
}
