package com.logicbuilding.part2;
import java.util.*;
public class ValidParenthesis {

	public static void main(String[] args) {
			System.out.println(isValidParenthesis());
	}	
	public static boolean isValidParenthesis() {
		String input = "((()))";
		Stack<Character> stack = new Stack<>();
		char[] a = input.toCharArray();
		for(char letter: a ) {
			if(letter == '(') {
				stack.push(letter);
			}else {
				if(stack.isEmpty()) {
					return false;
				}else {
					char poppedItem = stack.pop();
					if(poppedItem != '(') {
						return false;
					}
				}
			}
         
	     }
		return stack.isEmpty();
	}
}
