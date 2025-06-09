package com.logicbuilding.part2;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
           int[] a = {39,62,10,45,67,-2,32};
           int max1 = Integer.MIN_VALUE;
           int max2 = Integer.MIN_VALUE;
           for(int i : a) {
        	   if(i > max1) {
        		   max2 = max1;
        		   max1 = i;
        	   }else if(i > max2) {
        		   max2 = i;
        	   }
           }
           System.out.println("max2 =>" + max2);
		
	}

}
