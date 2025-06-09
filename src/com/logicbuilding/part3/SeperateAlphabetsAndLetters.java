package com.logicbuilding.part3;

public class SeperateAlphabetsAndLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "JaiHanuman123bless";
		StringBuilder alphabets = new StringBuilder();
		StringBuilder numbers = new StringBuilder();
		for(int i=0; i<input.length(); i++) {
			char c = input.charAt(i);
			if(c >= '0' && c <='9') {
				numbers.append(c);
			} else {
				alphabets.append(c);
			}
		}
		System.out.println("numbers =>" + numbers.toString());
		System.out.println("alphabets =>" + alphabets.toString());

	}

}
