package com.logicbuilding.part4;
import java.util.*;
public class ReverseMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> hashMap= new HashMap<>();
		hashMap.put("one", 1);
		hashMap.put("two", 2);
		hashMap.put("three", 3);
		hashMap.put("four", 4);
		Map<Integer, String> reverseMap= new HashMap<>();
		for(String keys : hashMap.keySet()) {
			reverseMap.put(hashMap.get(keys), keys);
		}
		System.out.println(reverseMap);

	}

}
