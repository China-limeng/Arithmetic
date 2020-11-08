package com.leet;

public class BestTime {
	public static void main(String[] args) {
		int[] arr = new int[] {7,2,3,4,5,6};
		int test = maxProfit(arr);
		System.out.println(test);
	}
	 public static int maxProfit(int[] prices) {
	        int sum = 0;
			for (int i = 0; i < prices.length-1; i++) {
				if(prices[i]<prices[i+1]) {
					sum = sum+prices[i+1]-prices[i];
				}
				
			}
			return sum;
	    }
}
