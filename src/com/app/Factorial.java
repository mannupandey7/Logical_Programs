package com.app;

/**
 * 
 * @author Mannu
 * Factorial of 5 means= 5*4*3*2*1=120 , 6=6*5*4*3*2*1=720
 *
 */
public class Factorial {
	/*static void fact(int num) {
		int fact=1;
		for(int i=1; i<=num; i++) {
			fact=fact*i;
		}
		System.out.println("factorial of "+num+" is "+ fact);
	}
	*/
	public static void main(String[] args) {
		
		//fact(5);
		int num=5;
		int fact=1;
		
		for(int i=1; i<=num; i++) {
			fact=fact*i;
		}
		System.out.println("factorial of "+num+" is "+fact);
	}
}
/**
 *here i have tried from two way 1- using method 2- without method
*/