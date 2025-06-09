package com.logicbuilding.part1;

public class PrintEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String sentence = "   Jai Hanuman four five Jai Hanuman   ";
		String sentence = "   Suresh Sheetals are doing superb   ";
		String[] words = sentence.trim().split(" ");
		for(String word : words) {
			if(word.length() % 2 == 0) {
				System.out.println(word);
			}
				
		}

	}
	
	

}
