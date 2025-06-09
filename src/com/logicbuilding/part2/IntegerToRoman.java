package com.logicbuilding.part2;

public class IntegerToRoman {

	public static void main(String[] args) {
		int num = 39;
		char[] romans = {'L', 'X', 'V', 'I'};
		int[] intValues = {50,10,5,1};
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<intValues.length; i++) {
			while(num >= intValues[i]) {
				sb.append(romans[i]);
				num = num - intValues[i];
			}
		}
		System.out.println("Roman Number equivalent is " + sb.toString());

	}

}
