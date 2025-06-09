package com.logicbuilding.part4;

public class TranspositionOfMatrix {

	public static void main(String[] args) {
		int[][] a = new int[3][2];
		//Fill up 3*2 matrix array
		a[0][0] = 1;  //[1,2,  [1,
		a[0][1] = 2;  // 3,4,   2,
		a[1][0] = 3;  // 5,6]
		a[1][1] = 4;
		a[2][0] = 5;
		a[2][1] = 6;
		// Edge case
		if(a == null || a.length == 0) {
			System.out.println("Transpose is not possible");
			System.exit(0);
		}
		int[][] b = new int[a[0].length][a.length];
		for(int row=0; row < a.length; row++) {
			for(int col = 0; col < a[row].length; col++ ) {
				b[col][row] = a[row][col];
			}
		}
		//Print the b array
		for(int row=0; row < b.length; row++) {
			for(int col = 0; col < b[row].length; col++ ) {
				System.out.print(b[row][col]);
			}
			System.out.println();
		}
		

	}

}
