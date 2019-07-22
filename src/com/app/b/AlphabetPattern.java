package com.app.b;

import java.util.Scanner;

public class AlphabetPattern {

	public static void m1(char a) {
		for(char c1='A'; c1<=a; c1++) {
			for(char c2='A'; c2<=c1; c2++) {
				System.out.print(c2);
			}
			System.out.println();
		}	
	}
	public static void main(String[] args) {

		//AlphabetPattern a=new AlphabetPattern();
		
		char a= new Scanner(System.in).next().charAt(0);
		m1(a);

	}
/***
 * There is NO method as nextChar() in java.util.Scanner class in Java. 
 * We need to use the next() method to read a single character as a string and then use 
 * charAt(0) to get the first character of that string. 
 * Scanner scanner = new Scanner(System.in); char ch = scanner.next().charAt(0);
 * 
 * For example: s.charAt(0) would return the first character of the string represented by instance s.
 */
}
