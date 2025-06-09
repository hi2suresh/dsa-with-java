package com.logicbuilding.part3;
import java.util.*;
public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int[] a1 = {1,2,9};
		int[] a2 = {3,5};
		int lengthOfResultArray = a1.length + a2.length;
		int[] a3 = new int[lengthOfResultArray];
		int i = 0;
		int j = 0;
		int k = 0;
		//Use 2 pointer approach
		while(i < a1.length && j < a2.length) {
			if(a1[i] < a2[j]) {
				a3[k] = a1[i];
				i++;
			} else {
				a3[k] = a2[j];
				j++;
			}
			k++;
		}
		// Push the remaining elements it could be either from a1 or a2
		while(i < a1.length) {
			a3[k] = a1[i];
			i++;
			k++;
		}
		while(j < a2.length) {
			a3[k] =a2[j];
			j++;
			k++;
		}
		System.out.println("Result is " + Arrays.toString(a3));

	}

}
