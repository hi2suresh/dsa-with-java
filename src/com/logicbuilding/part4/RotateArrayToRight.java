package com.logicbuilding.part4;
import java.util.*;
public class RotateArrayToRight {

	public static void main(String[] args) {
		int[] input = {1,2,3,4,5,6,7};
		int rotate = 3; // answer is {5,6,7,1,2,3,4}
//Mod will take care if the rotate is more than array length - Also,rotate 3times = rotate 10times
		int k = rotate % input.length; 
		int left = 0;
		int right = input.length - 1;
		//Reverse Array for the first time
		reverseArray(input, left, right);
		System.out.println(Arrays.toString(input));	
		//Reverse Array for the second time, with right value set to rotate-1
		right = k - 1;
		reverseArray(input, left, right);
		System.out.println(Arrays.toString(input));	
		
		//Reverse Array for the third time, with right value set to rotate-1
		left = k;
		right = input.length - 1;
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
