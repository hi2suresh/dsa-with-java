package com.logicbuilding.part4;

public class ReverseCaseOfString {

	public static void main(String[] args) {
		String input = "Hello World";
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<input.length(); i++) {
			char c = input.charAt(i);
			if(c >= 'a' && c <='z') {
				sb.append(Character.toUpperCase(c));
			} else {
				sb.append(Character.toLowerCase(c));
			}
		}
		System.out.println(sb.toString());

	}

}
