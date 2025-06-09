package com.logicbuilding.part1;

public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1210;
		//Don't modify the original number - because its being used 
		// later for comparison purpose
		int copyNum = num;
		//Taking a long number because of possible of overflow if 
		// the given number is maximum integer
		long result = 0;
		while(copyNum!=0) { //Number will eventually reach 0;
			int lastDigit = copyNum % 10;
			result = (result*10) + lastDigit;
			copyNum = copyNum / 10;
		}
		System.out.println("Is Palindrome? " + (num - result == 0));

	}

}
