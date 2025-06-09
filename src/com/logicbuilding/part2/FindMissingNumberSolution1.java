package com.logicbuilding.part2;

public class FindMissingNumberSolution1 {

	public static void main(String[] args) {
		// Works for Sequence and Unique Array
		int[] a = {1,2,4,5,6}; // 3 is missing
		int n = a[a.length -1]; // n is last index number i.e.6
		int sumOfNaturalNumbers = (n * (n+1)) / 2;
		int sumOfInputArray = 0;
		for(int num: a) {
			sumOfInputArray += num;
		}
		System.out.println("sumOfNaturalNumbers = " + sumOfNaturalNumbers);
		System.out.println("sumOfInputArray = " + sumOfInputArray);
		System.out.println("Missing Number = " + (sumOfNaturalNumbers - sumOfInputArray));

		

	}

}
