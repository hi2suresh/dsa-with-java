package com.logicbuilding.part1;

public class PrintHollowPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 6;
		for(int row=1; row<=num; row++) {
			for(int col=1; col<=row; col++) {
				if(col == 1 || col == row || row == num)
				System.out.print(col);
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}

}
