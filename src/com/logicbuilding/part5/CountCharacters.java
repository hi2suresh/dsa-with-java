package com.logicbuilding.part5;

public class CountCharacters {

	public static void main(String[] args) {
		//count # of characters that doesn't have space before and after
		String input ="Hie bcde"; //answer is 1 - only i doesn't have space before and after
		char[] arr = input.toCharArray();
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			// ignore if its whitespace
			if(arr[i] == ' ' ) continue;
			boolean before = i > 0 && arr[i-1] == ' ';
			boolean after = i <arr.length - 1 && arr[i+1] == ' ';
			//check if both before character and after character is not white space
			if(!before && !after) count++;
		}
		System.out.println(count);

	}

}
