package com.logicbuilding.part3;

public class MonotonicArray {

	public static void main(String[] args) {
		boolean increasing = true;
		boolean decreasing = true;
		
		int[] a = {1,2,3,6,5};
		for(int i=1; i < a.length; i++) {
			if(a[i-1] < a[i]) {
				decreasing = false;
			}else if(a[i-1] > a[i]) {
				increasing = false;
			}
		}
		System.out.println( "Is Monotonic array? " + (increasing || decreasing));
	}

}
