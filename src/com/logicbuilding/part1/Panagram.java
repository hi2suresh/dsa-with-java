package com.logicbuilding.part1;

public class Panagram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  temp= "The quick brown fox jumps over the lazy dog";
		System.out.println(isPanagram(temp));
	}
	//Panagram should contain all the 26 alphabets
	public static boolean isPanagram(String s) {
		if(s.length() <26) return false;
		String panagram = "abcdefghijklmnopqrstuvwxyz";
		s = s.toLowerCase();
		for(int i=0; i<panagram.length(); i++) {
			if(s.indexOf(panagram.charAt(i)) == -1) {
				return false;
			}
		}
		return true;
	}

}
