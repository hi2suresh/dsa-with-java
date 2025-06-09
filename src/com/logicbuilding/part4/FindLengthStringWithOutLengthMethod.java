package com.logicbuilding.part4;

import java.nio.channels.AlreadyBoundException;

public class FindLengthStringWithOutLengthMethod {

	public static void main(String[] args) {
		String input = "Hello";
		int count  = 0;
		try {
			while(true) {
				input.charAt(count);
				count++;
			}
			
		}catch(StringIndexOutOfBoundsException e ) {
			
			System.out.println(count);
		}
	}

}
