package com.logicbuilding.part1;

public class MaxProductOf3NumbersSolution2 {
	public static void main(String[] args) {
		int[] a = {-3, 5,6,-10,-20};
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;	
		for(int i : a) {
		//Find 1st max, 2nd max and 3rd max numbers
		 if(i > max1) {
				max3 = max2;
				max2 = max3;
				max1 = i;
			} else if( i > max2) {
				max3 = max2;
				max2 = i;
			} else if( i > max3) {
				max3 = i;
			} else if ( i < min1) { //Find 1st and 2nd minimum numbers
				min2 = min1;
				min2 = i;
			} else if(i < min2) {
				min2 = i;
			}
	
		}//Loop ends
		  int productOfPositiveNumbers = max1 * max2 * max3;
		    int product2 = min1 * min2 * max1;
		    int result = Math.max(product2, productOfPositiveNumbers);
		    System.out.println("Product of max 3 numbers is " + result);
		

	}

}
