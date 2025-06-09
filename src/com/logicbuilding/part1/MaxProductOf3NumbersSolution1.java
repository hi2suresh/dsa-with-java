package com.logicbuilding.part1;

import java.util.Arrays;

public class MaxProductOf3NumbersSolution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-3, 5,6,-10,-20};
		solution1(a);
        
	}
	
	public  static void solution1(int[] a) {
		// Step1 - sort the array
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int lastIndex = a.length-1;
    	// Find the product of last 3 numbers
		int product1 = a[lastIndex] * a[lastIndex - 1] * a[lastIndex-2];
		// If there are -ve numbers,find product of first 2 numbers 
		// and last number in sorted array
		int product2 = a[0] * a[1] * a[lastIndex];
		System.out.println(Math.max(product1, product2));
	
	}

}
