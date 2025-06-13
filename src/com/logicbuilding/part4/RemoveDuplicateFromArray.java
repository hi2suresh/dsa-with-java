package com.logicbuilding.part4;
import java.util.*;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		int[] input = {10,30,20,10,40,30};
		Set<Integer> dataSet = new LinkedHashSet<Integer>();
		for(int num: input) {
			dataSet.add(num);
		}
		//Streams
		int[] result = dataSet.stream().mapToInt(Integer::intValue).toArray();
		System.out.println(result);

	}

}
