package com.app.b;

import java.util.HashMap;

public class CountDuplicateWord {

	static void findDuplicateWord(String str) {
		HashMap<String, Integer> hm= new HashMap<>();
		String []s= str.split(" ");
		
		for(String tempString: s) {
			if(hm.get(tempString)!=null) {
				hm.put(tempString, hm.get(tempString)+1);
			}else {
				hm.put(tempString, 1);
			}
		}
		System.out.println(hm);
	}
	public static void main(String[] args) {

		findDuplicateWord("I am am Hero");
	}

}
