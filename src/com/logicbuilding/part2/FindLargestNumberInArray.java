package com.logicbuilding.part2;

public class FindLargestNumberInArray {

	public static void main(String[] args) {
		int[] a = {5,-90,2,89, 67,2005,1};
		int max = a[0];
		for(int num: a) {
			if(num > max) {
				max = num;
			}
		}
		System.out.println("Max number is " + max);

	}

}
