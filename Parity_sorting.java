package com.niuke.work;

import java.util.Arrays;

public class Test5 {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };
		int[] sortArrayByParityII = sortArrayByParityII(arr);
		System.out.println(Arrays.toString(sortArrayByParityII));
	}

	public static int[] sortArrayByParityII(int[] A) {
		for (int i = 0; i < A.length; i++) {
			if (i % 2 == 0) {
				if (A[i] % 2 == 0) {
					continue;
				} else {
					for (int j = i+1; j < A.length; j++) {
						if(A[j]%2==0) {
							int temp = A[j];
							A[j] = A[i];
							A[i] = temp;
							break;
						}
					}
				}
			}else {
				if(A[i]%2!=0) {
					continue;
				}else {
					for (int j = i+1; j < A.length; j++) {
						if(A[j]%2!=0) {
							int temp = A[j];
							A[j] = A[i];
							A[i] = temp;
							break;
						}
					}
				}
			}
		}
		return A;

	}

}
