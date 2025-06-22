package com.logicbuilding.part5;
import java.util.*;
public class RearrangeEvenAndOddInSortedWay {
	public static void main(String[] args) {
		// Even should be at first in a sorted way;Odd should be in last in a sorted way
		int[] a = {1,0,2,0,4,3,5};//{ 9, 2, 0, 4, 7, 6, 2, 3 };
		// First Part - Rearrange even and odd using 2 pointer approach
		int left = 0;
		int right = a.length - 1;
		while (right > left) {
			// Increase Left pointer till you find odd
			if (a[left] % 2 == 0) {
				left++;
			} else if (a[right] %2 != 0) { // Decrease right pointer till you find even
				right--;
			} else {// Swap left and right
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				left++;
				right--;
			}
		}
		//Find out the odd number starting point
		int oddNumberIndex = 0;
		while(a[oddNumberIndex] %2 == 0) {
			oddNumberIndex++;
		}
		Arrays.sort(a, 0 , oddNumberIndex); // sort until even arrays
		Arrays.sort(a,oddNumberIndex, a.length); // sort remaining odd arrays
		System.out.println(Arrays.toString(a));

	}

}
