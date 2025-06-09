package com.logicbuilding.part2;
import java.util.*;
public class FrequencyOfSpecialCharacters {

	public static void main(String[] args) {
		String s = "abJ1#49#~#@@@qw";
		char[] input = s.toCharArray();
		Map<Character, Integer> frequencyMap = new HashMap<>();
		for(char c: input) {
			if(!((c >= 'a' && c <='z') || (c >= 'A' && c <='Z') || (c >= '0' && c <='9') || (c == ' '))) {
				frequencyMap.put(c,frequencyMap.getOrDefault(c, 0) + 1);
			}
		}
		System.out.println(frequencyMap);

	}

}
