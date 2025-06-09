package com.logicbuilding.part2;
import java.util.*;

public class FrequencyOfCharacters {

	public static void main(String[] args) {
		String str = "Jai Hanuman";
		char[] input = str.toCharArray();
		Map<Character, Integer> frequencyOfChars = new HashMap<>(); 
		for(char s: input) {
			frequencyOfChars.put(s, frequencyOfChars.getOrDefault(s,0)+1);
		}
		System.out.println(frequencyOfChars);
	}

}
