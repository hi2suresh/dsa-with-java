package com.logicbuilding.part5;
import java.util.*;
public class CountFrequencyOfWords {

	public static void main(String[] args) {
		String input = "Hi this world is beautiful very very beautiful";
		String[] arr = input.split(" ");
		Map<String, Integer> frequenyMap = new HashMap<>();
		for(String word: arr) {
			frequenyMap.put(word, frequenyMap.getOrDefault(word, 0) + 1);
		}
		System.out.println(frequenyMap);
	}

}
