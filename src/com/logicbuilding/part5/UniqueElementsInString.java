package com.logicbuilding.part5;
import java.util.*;
public class UniqueElementsInString {

	public static void main(String[] args) {
		int[] a = {1,2,3,1,2,4}; //answer should be 3, 4
		Set<Integer> seen = new HashSet();
		Set<Integer> duplicates = new HashSet();
		for(int i: a) {
// add returns if the element is succesfully added or not; duplicate elements wont be added and returns false
			if(!seen.add(i)) {  
				duplicates.add(i);
			}
		}
		seen.removeAll(duplicates);
		System.out.println(seen);
	}

}
