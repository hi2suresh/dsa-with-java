package com.logicbuilding.part2;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,20,30,40,50,60};
		int length = a.length;
		for(int i=0, j= length-1; i<length/2 ; i++,j-- ) {
			if(i != j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;			
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
