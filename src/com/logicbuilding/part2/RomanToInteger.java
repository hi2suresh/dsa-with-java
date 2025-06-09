package com.logicbuilding.part2;
import java.util.*;
public class RomanToInteger {

	public static void main(String[] args) {
		String input = "1X" ; //"V111";
		HashMap<Character, Integer> romanMap = new HashMap<>();
		romanMap.put('1', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		int result = 0;
		int previousValue = 0;
		for(int i=input.length()-1; i>=0; i--) {
			int currentValue = romanMap.get(input.charAt(i));
			if(currentValue >= previousValue) {
				result += currentValue;
			} else {
				result -= currentValue;
			}
			previousValue = currentValue;
		}
		System.out.println("Roman to Integer is " + result);
	}

}
