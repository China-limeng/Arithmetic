package com.offcn.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TheSumOfTwoNumbers {
	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,1,1,3,5,6,7};
		int[] twoSum = twoSum(arr, 15);
		System.out.println(Arrays.toString(twoSum));
	}
	public static int[] twoSum(int[] nums, int target) {
		//现将int数组转为integer数组
		//1.先将int数组转为数值流
//		IntStream stream = Arrays.stream(nums);
//		Stream<Integer> boxed = stream.boxed();
//		Integer[] array = boxed.toArray(Integer[]::new);
//		HashSet<Integer> hashSet = new HashSet<Integer>(Arrays.asList(array));
		
		for (int i = 0;i<nums.length;i++) {
			int k = nums[i]; //计数器，统计当前值
			for(int l =i+1;l<nums.length;l++) {
				if(k == nums[l]) {
					continue;
				}
				if(k+nums[l]==target) {
					return new int[] {i,l};
				}
				
			}
			
		}
		
		return null;
   }
	
}
