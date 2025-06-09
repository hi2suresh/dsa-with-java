package com.logicbuilding.part4;
import java.util.*;
public class RotateArrayToLeftByNTimes {

	public static void main(String[] args) {
		int[] input = {1,2,3,4,5,6,7};
		int rotate = 3; // answer is {4,5,6,7,1,2,3}
		int k = rotate % input.length; //Avoids Array Index out of position error
		int left = 0;
		int right = k - 1;
		//Reverse only until k - 1 for first time
		reverseArray(input, left, right);
		System.out.println(Arrays.toString(input));
		//Reverse from k till last element for second time
		left = k;
		right = input.length - 1;
		reverseArray(input, left, right);
		System.out.println(Arrays.toString(input));
		//Reverse entire array
		left = 0;
		reverseArray(input, left, right);
		System.out.println(Arrays.toString(input));
	}
	
	public static void reverseArray(int[] a, int left, int right) {
		while (right > left) {
			int temp = a[left];
			a[left] = a[right];
			a[right] = temp;
			left++;
			right--;
		}
	}


}
