package com.niuke.work;

import java.util.Arrays;

public class Next_Permutation {
	/**
	 * 实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
	   如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = new int[] {3,2,1,1};
		nextPermutation(arr);
	}
	 public static void nextPermutation(int[] nums) {
		 //降序排列,如果进去，则改变然后输出，强制退出
		 for (int i = 1; i < nums.length-1; i++) {
			for (int j = 0; j < nums.length-i; j++) {
				if(nums[j]<nums[j+1]) {
					
					
					int temp = nums[j+1];
					nums[j+1] = nums[j];
					nums[j] = temp;
					System.out.println(Arrays.toString(nums));
					System.exit(-1);
				}
			}
		}
		 //当前数组是否为最大值，如果是则输出最小值
		 Arrays.sort(nums);
		 
		 System.out.println(Arrays.toString(nums));
	 }
}
