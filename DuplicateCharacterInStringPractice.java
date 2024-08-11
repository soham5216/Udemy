package udemy;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class DuplicateCharacterInStringPractice {
	//Write a program to find occurrence of every characters in following string
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Welcome to Wipro";
		
		char[] arr=s.toCharArray();
		HashMap<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}
			
		}
		
		for(Character x:map.keySet()) {
			
			System.out.println("occurence of each character "+x+" is: "+map.get(x));
			
		}
	}

}
