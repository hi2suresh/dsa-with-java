package com.logicbuilding.part1;

public class EvenOrOdd {

	public static void main(String[] args) {
		int num = 20;
		/**
		 * Using Bitwise operator
		 * if the number is odd, then bitwise & of that
		 * number with 1 will result in 1
		 * e.g 7 -> 1 1 1 (in binary)
		 *     1 -> 0 0 1
		 *          ------
		 *          0 0 1
		 *          
		 *     6 -> 1 1 0
		 *     1 -> 0 0 1
		 *          -----
		 *          0 0 0
		 */
		if((num & 1) == 1) {
			System.out.println("Odd");
		}else {
			System.out.println("Even");
		}

	}

}
