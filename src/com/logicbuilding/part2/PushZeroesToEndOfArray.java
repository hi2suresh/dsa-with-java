package com.logicbuilding.part2;

import java.util.Arrays;

public class PushZeroesToEndOfArray {

	public static void main(String[] args) {
		int[] a = {10,20,0,4,0,27,0,29,30,31};
		int zeroPointer = 0;
		for(int current=0; current<a.length; current++) {
			if(a[current] !=0) {
				int temp = a[current];
				a[current] = a[zeroPointer];
				a[zeroPointer] = temp;
				zeroPointer++;
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
