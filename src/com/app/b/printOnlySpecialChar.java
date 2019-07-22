package com.app.b;

public class printOnlySpecialChar {

	private static void printOnlySpecial(String s) {

		String specialChar="!@#$%^&'";
		int count=0;
		for(int i=0; i<s.length(); i++) {
			if(specialChar.contains(Character.toString(s.charAt(i)))) {
				System.out.println("special char are"+ s.charAt(i));
			}
			count++;

		}
		System.out.println(count);

	}
	public static void main(String[] args) {

		String s="ABCD123@#$";
		printOnlySpecial(s);

	}

}
