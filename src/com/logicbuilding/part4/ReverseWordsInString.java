package com.logicbuilding.part4;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String input = "This is fun"; //answer should be siht si nuf
		StringBuilder sb = new StringBuilder();
		String[] words = input.split(" ");
		int wordLength = words.length;
		for(String word: words) {
			char[] letters = word.toCharArray();
			for(int i=letters.length - 1; i>=0; i--) {
				sb.append(letters[i]);
			}
			if(wordLength > 1) {
				sb.append(" ");
				wordLength--;
			}
		}
		System.out.println(new String(sb));
	}

}
