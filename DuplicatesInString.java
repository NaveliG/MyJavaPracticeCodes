package com.oop.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicatesInString {

	public void findIt(String str) {
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		char[] charArray=str.toCharArray();
		for(Character ch:charArray) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		
		Set<Character> keys=map.keySet();
		for(Character ch:keys) {
			if(map.get(ch)>1) {
				System.out.println(ch+" is " +map.get(ch) +" times");
			}
		}
	
		
	}
	
	
	public static void main(String[] args) {
		DuplicatesInString obj = new DuplicatesInString();
		obj.findIt("India is ,my cpuntry");
	}
}
