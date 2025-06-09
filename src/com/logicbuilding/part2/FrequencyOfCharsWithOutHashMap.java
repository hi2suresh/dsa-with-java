package com.logicbuilding.part2;

public class FrequencyOfCharsWithOutHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcedw1aa#c~";
		char[] input = s.toCharArray();
	// integer array will have default values of 0;
		int[] a = new int[256];
		for(char c: input) {
			a[c] = a[c] + 1;
		}
		
		//print frequency of elements
		for(int i=0; i<a.length; i++) {
			if(a[i] > 0)
			System.out.print((char) i + "=>" + a[i] + " ");
		}
		

	}

}
