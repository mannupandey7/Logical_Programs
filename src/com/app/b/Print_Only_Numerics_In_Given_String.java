package com.app.b;

import java.util.Scanner;

public class Print_Only_Numerics_In_Given_String {

	private static void printSpcl(String str) {
		for(int i=0; i<str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				System.out.println(str.charAt(i));
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str=new Scanner(System.in).next();
		printSpcl(str);
		

	}

}
