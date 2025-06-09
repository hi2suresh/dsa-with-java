package com.logicbuilding.part3;
import java.util.*;
public class PrintEvenOrOddFromArrayList {

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add("Jai Hanuman");
		al.add(24);
		al.add(false);
		al.add(25.5);
		al.add(26);
		for(Object o : al) {
			if(o instanceof Integer) {
				if(((Integer)o).intValue() % 2 == 0) {
					System.out.println(o);
				}
			}
		}

	}

}
