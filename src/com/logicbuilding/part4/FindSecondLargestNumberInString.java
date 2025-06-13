package com.logicbuilding.part4;

public class FindSecondLargestNumberInString {

	public static void main(String[] args) {
		String input = "Hello 378 World";
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		char[] arr = input.toCharArray();
		for(char temp: arr) {
			if(Character.isDigit(temp)) {
				int num = Integer.parseInt(temp+"");
				if(num > first) {
					second = first;
					first = num;
				}else if(num > second) {
					second = num;
				}
				System.out.println(first + " " + second);
			}
		}
		System.out.println("second largest="+ second);
	}

}
