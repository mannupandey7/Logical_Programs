package com.app;

import java.util.Scanner;

/**
 * @author Mannu
 * 
 * Armstrong means 153= 1*3+5*3+3*3=153, 370,371,407(3 power of 1 like that)
 */
public class Armstrong {

	public static void main(String[] args) {

		int num= new Scanner(System.in).nextInt();
		Armstrong a= new Armstrong();
		a.armStr(153);

	}
	public void armStr(int num) {
		int sum=0, temp=num;
		while(temp>0) { //370,37,3,0 o means false
			int r=temp%10;	// 0,7,3
			sum=sum +(r*r*r);	 //0,343,370
			temp=temp/10;	// 37,3,0

		}
		if(num==sum) {		//370==370 means true
			System.out.println(num+" is armstrong number");

		}else {
			System.out.println(num+" is not a armstrong number");
		}
	}
}
