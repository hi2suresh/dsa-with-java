package com.logicbuilding.part1;
import java.util.*;
public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		
		String testData = "Java";
		char[] chars = testData.toCharArray();
		Set<Character> lhs = new LinkedHashSet<>();
		StringBuilder result = new StringBuilder();
		
		for (char c : chars) {
			if(lhs.add(c)) {
				result.append(c);
			}
		}
		System.out.println(result);

	}

}
