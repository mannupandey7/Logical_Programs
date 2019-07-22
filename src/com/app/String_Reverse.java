package com.app;

public class String_Reverse {

	public static void main(String[] args) {

		String name="mannu pandey";
		int len= name.length();
		String res="";
		for(int i=len-1; i>=0; i--) {
			res= res+name.charAt(i);
		
		}
		System.out.println(res);
	}
}
