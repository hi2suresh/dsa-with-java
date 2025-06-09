package com.logicbuilding.part3;

public class FibonaciiSeries {

	public static void main(String[] args) {
		//Print fib numbers until 10
		int first = 0;
		int second = 1;
		int n = 10;
		
		System.out.print(first + " " + second + " ");
		for(int i=2;  i<=n; i++) {
			int next = first + second;
			System.out.print(next + " ");
			first = second;
			second = next;
		}

	}

}
