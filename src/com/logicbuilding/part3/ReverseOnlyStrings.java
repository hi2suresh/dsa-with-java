package com.logicbuilding.part3;

public class ReverseOnlyStrings {

	public static void main(String[] args) {
		String input = "1ab2"; // answer is 1ba2;
		char[] a = input.toLowerCase().toCharArray();
		int left = 0;
		int right = a.length - 1;
		String aplabets = "abcdefghijklmnopqrstuvwxyz";
		while(right > left) {
			//Increase left pointer until you get a letter
			if(aplabets.indexOf(a[left]) == -1) {
				left++;	
				//Decrease right pointer until you get a letter
			}else if(aplabets.indexOf(a[right]) == -1) {
				right--;
			}else { // Since both left and right pointers are pointing to letters, swap them
				char temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				left++;
				right--;
			
			}
		}
		
		System.out.println(new String(a));

	}

}
