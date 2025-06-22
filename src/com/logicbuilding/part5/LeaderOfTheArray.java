package com.logicbuilding.part5;

public class LeaderOfTheArray {

	public static void main(String[] args) {
		// Any number which is bigger than all the numbers to its right
		int[] a = {16,17,3,4,5,2}; // result is 17, 5, 2
		// Last number is by default Leader as there is no number to its right
		int maxRight = a[a.length-1];
		System.out.println(maxRight);
		for(int i=a.length-2; i>=0; i--) {
			if(a[i]>maxRight) {
				maxRight = a[i];
				System.out.println(a[i]);
			}
		}
	}

}
