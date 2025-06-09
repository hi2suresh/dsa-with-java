package com.logicbuilding.part3;

public class ReverseOnlyVowels {

	public static void main(String[] args) {
		String input = "Hello"; // Answer should be Holle
		String vowels = "aeiouAEIOU";
		int left = 0;
		int right = input.length()-1;
		char[] a = input.toCharArray();		
		while(right > left) {
		if(vowels.indexOf(a[left]) == -1) {
			left++; //This means left pointer char is not a vowel
		}else if(vowels.indexOf(a[right]) == -1) {
			right--; //This means right pointer char is not a vowel
		}else {// swap when both pointers are pointing to vowel
			char temp = a[left];
			a[left] = a[right];
			a[right] = temp;
			left++;
			right--;
		}
			
		}
		System.out.println(a);

	}

}
