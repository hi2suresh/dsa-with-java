package com.logicbuilding.part2;

public class CountVowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vowels = "aeiouAEIOU";
		String input = "The quick jump scan of fox";
		int result = 0;
		for(int i=0; i<input.length(); i++) {
			char c = input.charAt(i);
			if(vowels.indexOf(c) != -1) {
				System.out.println(c);
				result++;
			}
		}
		System.out.println("No of vowels in input is =>" + result);
	}

}
