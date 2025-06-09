package com.logicbuilding.part1;
import java.math.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
//		Very important to use BigInteger to avoid integer overflow 
		BigInteger result = BigInteger.ONE;
		for(int i=2; i<=num; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		System.out.println("Fact = " + result);
	}

}
