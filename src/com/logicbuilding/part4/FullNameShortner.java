package com.logicbuilding.part4;

public class FullNameShortner {

	public static void main(String[] args) {
		String fullName = "Suresh Govinda Rao";
		String[] a = fullName.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i=0; i < a.length-1; i++) {
			sb.append(a[i].charAt(0)).append('.');
		}
		sb.append(a[a.length-1]);
		System.out.println(sb);

	}

}
