package com.offcn.cpu_factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class The_one_and_only {
	public static void main(String[] args) {
		int [] nums = {1,1,2,2,3,3,3};
		IntStream stream = Arrays.stream(nums);
		Stream<Integer> boxed = stream.boxed();
		Integer[] arr = boxed.toArray(Integer[]::new);
		
//		Integer[] arr = new Integer[] {1,1,2,2,3,3,3};
		 Integer[] test1 = test1(arr);
		 System.out.println(Arrays.toString(test1));
		 HashSet<Integer> hashSet = new HashSet<Integer>(Arrays.asList(test1));
		 
		 if (hashSet.size()!=test1.length) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
		
	}
	public static Integer[]  test1(Integer[] arr) {
		List<Integer> asList = Arrays.asList(arr);
		HashSet<Integer> hashSet = new HashSet<Integer>(asList);
		Iterator<Integer> iterator = hashSet.iterator();
		Integer[] count = new Integer[(hashSet.size())];
		int j = 0; //计数器，统计数组下标
		int k = 0; //计数器，统计出现次数
		while (iterator.hasNext()) {
			Integer next = iterator.next(); // 当前值，防止
			System.out.println("next--"+next);
			for (int i = 0; i < arr.length; i++) {
				if(next==arr[i]) {
					count[j] = ++k;
				}
			}
			j++;
			k=0;
		}
		
		return count;
	}
	
	
}

