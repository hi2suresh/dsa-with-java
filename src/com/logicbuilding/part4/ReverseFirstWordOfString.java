package com.logicbuilding.part4;

public class ReverseFirstWordOfString {

	public static void main(String[] args) {
		String input = "Hello World from Australia";
		String[] arr = input.split(" ");
		StringBuilder result = new StringBuilder();
		char[] firstWord = arr[0].toCharArray();
		//Reverse first word
		int left = 0;
		int right = firstWord.length - 1;
		while(right > left) {
			char temp = firstWord[left];
			firstWord[left] = firstWord[right];
			firstWord[right] = temp;
			right--;
			left++;
		}
		//append reversed word
		for(char c: firstWord) {
			result.append(c);
		}
		//append rest of the words
		for(int i=1; i<arr.length; i++) {
			result.append(" " +arr[i]);
		}
        System.out.println(new String(result));
	}

}
