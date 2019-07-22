package com.app;
/**
 * 
 * @author Mannu
 * 
 * Palindrome means when we reverse no like 121 then ans should be come like reverse 121
 * 535= 535
 * 454=454
 *
 */
public class PallindromeNumber {
		
	public static void main(String[] args) {
		
		int no= 121;
		int temp=no; // i want to save original no. so that 
					//	 storing no in another variable means here in temp
		int rev=0, reminder;	// reverse because i have to get reverse first, reminder 
		
		while(temp !=0) {	// then we will use while loop(if 10 not equals to 0)
			reminder =temp % 10;	// get the reminder here temp modules 10 
			rev=rev*10+reminder; // reverse
			temp=temp/10;// 
		}
		if(no==rev) {
			System.out.println(no +" is Pallindrome");

		}else {
			System.out.println(no+" is not a Pallindrome");
		}
	}
}
// first checked condition 121!=0  means condition is true
// reminder = 1
// rev = 0*10+1 = 1
// temp =121/10 = 12

// then 12!=0 true
// reminder= 2
// rev=1*10+2=12
// temp = 12/10= 1

// 1!=0 true
// reminder= 1
// rev =12*10+1=121
// temp = 1/10= 0

// 0!=0 false
 
