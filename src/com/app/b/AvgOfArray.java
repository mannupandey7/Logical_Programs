package com.app.b;

import java.util.Scanner;

public class AvgOfArray {

	public static void main(String[] args) {
		
		/*int num=0;
		int total=0;
		float avg=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the elements");
		num= sc.nextInt();
		
		int arr[]= new int[num];
		System.out.println("Enter the values");
		
		for(int i=0; i<num; i++) {
			
			arr[i]=sc.nextInt();
			total=total+arr[i];
		}
		
		avg=(float)total/num;
		System.out.println("avg"+avg);*/
		
		int [] num= {50,50,50,50,90};
		int len=num.length;
		int total=0;
		int avg=0;
		
		for(int i=0; i<len; i++) {
			total=total+num[i];
		}
		System.out.println(total);
		
		avg=total/len;
		System.out.println(avg);
	}
}