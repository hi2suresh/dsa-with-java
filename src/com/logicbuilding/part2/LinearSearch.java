package com.logicbuilding.part2;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {20,10,-9,5,25};
		int elementToFind = 50;
		for(int i=0; i< a.length; i++) {
			if(a[i] == elementToFind) {
				System.out.println("Element found at " + i);
				break;
			}
		}
		System.out.println("Element not found");
	}

}
