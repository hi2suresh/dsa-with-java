package com.logicbuilding.part3;

public class ChangingKeys {

	public static void main(String[] args) {
		
		String input = "abBbcCd"; //Answer should be 3
		int count = 0;
		char[] a = input.toLowerCase().toCharArray();
		int lastKey = a[0];
		for(int i=1; i<a.length; i++) {
			char currentKey = a[i];
			if(lastKey != currentKey) {
				count++;
			}
			lastKey = currentKey;
		}
		System.out.println("The number of changing keys is " + count);
		
		
	}

}
