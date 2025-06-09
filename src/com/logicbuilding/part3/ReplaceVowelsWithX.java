package com.logicbuilding.part3;

public class ReplaceVowelsWithX {

	public static void main(String[] args) {
		String input = "NameInthou";
		String vowels = "aeiouAEIOU";
		StringBuilder sb = new StringBuilder();
		for(int i=0; i< input.length(); i++) {
			char c = input.charAt(i);
			if(vowels.indexOf(c) != -1) {
				sb.append('x');
			} else {
				sb.append(c);
			}
		}
		System.out.println(sb);

	}

}
