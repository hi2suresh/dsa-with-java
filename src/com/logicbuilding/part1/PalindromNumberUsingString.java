package com.logicbuilding.part1;

public class PalindromNumberUsingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1214;
       // First way of converting int to string
		String numInString = num + "";
		//Second way of converting int to string
		String numInString2 = Integer.toString(num);
		
		StringBuilder sb = new StringBuilder(numInString);
		
		System.out.println("Is Palindrome? " + sb.reverse().toString().equals(numInString));

	}

}
