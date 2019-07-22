package com.app.b;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
	public static void main(String[] args) {

		int [] arr= {2,1,3};
		Arrays.sort(arr);
		for(int i=0; i<=arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//System.out.println();
	}
}
/**
 * Collections.sort() in Java with Examples 
 * It is used to sort the elements present in the specified list of Collection 
 * in ascending order. It works similar to java.util.Arrays.sort() method but it is 
 * better then as it can sort the elements of Array as well as linked list, 
 * queue and many more present in it.
 */
