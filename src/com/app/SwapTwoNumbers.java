package com.app;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int a=1, b=2, temp;
		System.out.println("Before swapping");
		System.out.println("a= "+a+"b="+b);
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping");
		System.out.println("a= "+a+"b="+b);
		
	}

}
