package com.logicbuilding.part5;

public class UniqueElementInArraySolution2 {
public static void main(String[] args) {
	int[] a = {1,2,3,1,2,4}; //answer should be 3, 4
	for(int i=0; i<a.length; i++) {
		int count = 0;
		for(int j=0; j<a.length; j++){
			if(a[i] == a[j]) {
				count++;
			}
		}
		if(count == 1) {
			System.out.println(a[i]);
		}
	}

}
}
