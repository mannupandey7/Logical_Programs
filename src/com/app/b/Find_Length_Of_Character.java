package com.app.b;

import java.util.Scanner;

public class FindLengthOfCharacter {

	public String findLength(String str) {
		int count=0;
		for(char c: str.toCharArray()) { //The java string toCharArray() method converts the given string 
										//into a sequence of characters.
			count++;
		}
		System.out.println(count);
		return str;
	}
	public static void main(String[] args) {

		String str= new Scanner(System.in).next();
		FindLengthOfCharacter f= new FindLengthOfCharacter();
		f.findLength(str);
	}

}
