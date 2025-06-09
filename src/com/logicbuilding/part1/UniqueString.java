package com.logicbuilding.part1;
import java.util.*;
public class UniqueString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aabcccccdba";
		Set<Character> inputSet = new LinkedHashSet<>();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<input.length(); i++) {
			if(inputSet.add(input.charAt(i))) {
				sb.append(input.charAt(i));
			}
		}
		System.out.println(sb);

	}

}
