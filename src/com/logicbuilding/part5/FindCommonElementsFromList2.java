package com.logicbuilding.part5;
import java.util.*;
import java.util.stream.*;
public class FindCommonElementsFromList2 {
 public static void main(String[] args) {
	List<String> list1 = new ArrayList<String>();
	list1.add("One");
	list1.add("How");
	list1.add("Ten");
	
	List<String> list2 = new ArrayList<String>();
	list2.add("Two");
	list2.add("Ten");
	list2.add("How");

	// First method -> Retail All -> its a builtin method to store only common elements
	list1.retainAll(list2); // Now this list only has common elements
	//Second way using streams
	Set<String> result = list1.stream().filter(str -> list2.contains(str)).collect(Collectors.toSet());
	System.out.println(result);
}
}
