package com.niuke.work;

import java.util.Arrays;

public class Next_Permutation {
	/**
	 * ʵ�ֻ�ȡ��һ�����еĺ������㷨��Ҫ���������������������г��ֵ�������һ����������С�
	   �����������һ����������У��������������г���С�����У����������У���
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = new int[] {3,2,1,1};
		nextPermutation(arr);
	}
	 public static void nextPermutation(int[] nums) {
		 //��������,�����ȥ����ı�Ȼ�������ǿ���˳�
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
		 //��ǰ�����Ƿ�Ϊ���ֵ��������������Сֵ
		 Arrays.sort(nums);
		 
		 System.out.println(Arrays.toString(nums));
	 }
}
