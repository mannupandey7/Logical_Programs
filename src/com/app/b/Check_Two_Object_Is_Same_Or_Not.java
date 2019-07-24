package com.app.b;

import java.util.Scanner;

public class Check_Two_Object_Is_Same_Or_Not {

	public static void check( String str) {
		if(str.equals("abc")) {
			System.out.println("Hiii");
			
		}else {
			System.out.println("Hello");
		}
		
	}
	
	public static void main(String[] args) {
		
		String sc=new Scanner(System.in).next();
//		CheckHiiHello c=new CheckHiiHello();
		check(sc);
		
	}

}
