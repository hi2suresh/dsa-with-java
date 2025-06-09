package com.logicbuilding.part2;
import java.util.*;
public class AnagramSol1 {

	public static void main(String[] args) {
		// Anagram means both strings contain same characters irrespective of position
		// e.g silent == listen
		
		String s1 = "abc";
		String s2 = "bas";
		System.out.println(isAnagram(s1, s2));

	}
	
	public static boolean isAnagram(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		for(int i=0; i<a1.length; i++) {
			if(a1[i] != a2[i]) return false;
		}
		return true;
	}

}
