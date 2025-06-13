package com.logicbuilding.part4;

public class CountUpperAndLowerCaseInString {

	public static void main(String[] args) {
		String input = "Jai Hanuman";
		int upper = 0;
		int lower = 0;
		for(int i =0; i<input.length(); i++) {
			char c = input.charAt(i);
			if(Character.isUpperCase(c)) {
				upper++;
			}else if(Character.isLowerCase(c)) {
				lower++;
			}
		}
		System.out.println("Upper =>" + upper + " Lower =>" + lower);
	}

}
