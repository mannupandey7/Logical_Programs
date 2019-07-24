package com.app.b;

import java.util.Scanner;

public class AlphabetCharacterv {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		char ch=s.next().charAt(0);
		if((ch>='a'&& ch<='z')|| (ch>='A'&& ch<='Z')) {
			System.out.println(" the given character is alphabet");
		}else {
			System.out.println(" the given character is not alphabet");
		}
		
	}

}
