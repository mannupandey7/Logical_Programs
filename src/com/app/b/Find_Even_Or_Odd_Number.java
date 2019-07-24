package com.app.b;

import java.util.Scanner;

public class Even_Numbers {

	public static void main(String[] args) {
		Scanner r= new Scanner(System.in);
		int no= r.nextInt();
		
		if(no%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("odd");
		}
	}
}