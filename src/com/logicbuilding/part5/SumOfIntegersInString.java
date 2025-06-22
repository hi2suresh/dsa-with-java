package com.logicbuilding.part5;
import java.util.*;
public class SumOfIntegersInString {

	public static void main(String[] args) {
		String input = "This String 25 has 33 40 100 numbers";
		String[] words = input.split(" ");
		int count = 0;
		for(String word: words) {
			try {
				count = count + Integer.parseInt(word);
			}catch(NumberFormatException e) {
				
			}
		}
		System.out.println(count);
	}

}
