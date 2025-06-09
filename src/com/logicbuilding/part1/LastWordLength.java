package com.logicbuilding.part1;

public class LastWordLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "   Hello World moon   ";
		int count = 0;
		for(int i=word.length()-1; i >= 0; i--) {
			if(word.charAt(i) != ' ') {
				count++;
			}else {
//				This is important to take care of any spaces from the last
				if(count > 0)
				break;
			}
		}
		System.out.println(count);
	}
	


}
