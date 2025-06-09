package com.logicbuilding.part3;

public class FindTheFirstAndLastOccuranceOfCharacter {
public static void main(String[] args) {
	
	String input = "Hello World";
	char charToFind = 'l';
	int firstIndex = -1;
	int lastIndex = -1;
    // Find First Index
	for(int i=0; i<input.length() ; i++) {
		if(input.charAt(i) == charToFind) {
			firstIndex = i;
			break;
		}
	}
	// Find Last Index
	for(int i=input.length()-1; i>=0 ; i--) {
		if(input.charAt(i) == charToFind) {
			lastIndex = i;
			break;
		}
	}
	System.out.println("First and Last Indexes are " + firstIndex + "," + lastIndex);
}
}
