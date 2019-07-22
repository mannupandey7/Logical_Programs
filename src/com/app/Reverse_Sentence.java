package com.app;

public class Reverse_Sentence {

	public static void main(String[] args) {

		String s= "i love my india";
		String[]split=s.split(" ");	//The string split() method breaks a given string around matches 
									//of the given regular expression.
		String result="";
		for(int i=split.length-1;i>=0;i--) {
			result+=(split[i]+" ");
		}
		System.out.println(result);
		
	}

}
