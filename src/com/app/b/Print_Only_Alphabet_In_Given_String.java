package com.app.b;

public class PrintOnlyAlphabet {

	public static void main(String[] args) {

		String s="ABcDE146@!#";
		
		printOnlyChar(s);
	}
	
	private static void printOnlyChar(String s) {
		//he isLetter(char ch) method of Character class determines whether 
		//the given(or specified) character is a letter or not. 
		
		/*for(int i=0; i<s.length(); i++) {
			if(Character.isLetter(s.charAt(i))) {
				System.out.println(s.charAt(i));
			}
		}*/
		
		for(int i=0; i<s.length();i++) {
			if(Character.isLetter(s.charAt(i))) {
				System.out.println(s.charAt(i));
			}
		}
	}
	

}
