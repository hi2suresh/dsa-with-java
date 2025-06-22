package com.logicbuilding.part5;
import java.util.*;
public class MaxQuantity {

	public static void main(String[] args) {
		// This should give max quantity of product
		String[] a = {"apple 19", "orange 5", "apple 8", "pear 24", "apple 1", "orange 15"};
		Map<String, Integer> productMap = new HashMap<>();
		int maxQuantity = Integer.MIN_VALUE;
		String maxProduct = "";
		for(String product: a) {
			String[] temp = product.split(" ");
			productMap.put(temp[0], productMap.getOrDefault(temp[0],0) + Integer.parseInt(temp[1]));
			if(productMap.get(temp[0]) > maxQuantity) {
				maxProduct = temp[0];
				maxQuantity = productMap.get(maxProduct);
			}
		}
		System.out.println(productMap);
		System.out.println(maxProduct + "=>" + maxQuantity);

	}

}
