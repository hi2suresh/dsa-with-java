package com.logicbuilding.part2;

public class FindMissingNumberSolution2 {

	public static void main(String[] args) {
		// Works for Sequence and Unique Array
		int[] a = {1,2,4,5,6}; // 3 is missing
		int missingNumber = 0;
		//Do 2 times EX-OR first with input array and second with full array
		for(int i : a) { //Ex-or with input array
			missingNumber = missingNumber ^ i;
		}
		System.out.println("Missing number of Input Array: " + missingNumber);
		for(int i=1; i<=6; i++) { //Do Ex-or again with missing number of input array
			missingNumber = missingNumber ^ i;
		}
		System.out.println("Missing number: " + missingNumber);

	}

}
