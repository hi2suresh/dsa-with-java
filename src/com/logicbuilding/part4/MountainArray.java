package com.logicbuilding.part4;

public class MountainArray {

	public static void main(String[] args) {
		int[] a = {1,2,3,6,4,3,1,0};
		System.out.println(isMountainArray(a));
	}
	
	static boolean isMountainArray(int[] a) {
		//array length should be greater than 2
		if(a.length < 3) return false;
		int i = 0;
		//elements should be in increasing order - increase till you find peek
		while(i+1 < a.length && a[i] < a[i+1]) {
			i++;
		}
		//the elements should now be in decreasing order
		while(i+1 < a.length && a[i] > a[i+1]) {
			i++;
		}
		//if its mountain array, then count of i should be equal to # of array elements
		return i == a.length - 1;
	}

}
