package com.logicbuilding.part1;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     reverse(-1253);
	}
	
	/***
	 * To get last digit use % operator
	 * @param num
	 */
	public static void reverse(int num) {
//		Very important - there is a chance of overflow if you reverse maximum integer hence making it long instead of integer
		long reversedNumber = 0;
		int lastDigit;
//		This condition will take care of even -ve numbers
		while(num != 0) { 
			lastDigit = num % 10;
			reversedNumber = reversedNumber * 10 + lastDigit;
			num = num / 10;
		}
		System.out.println(reversedNumber);
	}

}
