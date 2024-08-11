package udemy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Swiss";
		char[] arr=str.toLowerCase().toCharArray();
		
		HashMap<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		int count=1;
		
		//First non repeated character from beginning of String 
		/*
		 * for(int i=0; i<arr.length; i++) { 
		 * if(!map.containsKey(arr[i])) {
		 * map.put(arr[i], count); 
		 * }else { 
		 * map.put(arr[i], map.get(arr[i])+1); } }
		 */
		
		//First non repeated character from end of string 
		for(int i=arr.length-1; i>=0; i--) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		/*
		 * for(Entry<Character, Integer> entry:map.entrySet()) { if(entry.getValue()==1)
		 * {
		 * System.out.println("The first non repeated character is : "+entry.getKey());
		 * break; } }
		 */
		for(Character key:map.keySet()) {
			if(map.get(key)==1) {
				System.out.println("The first non repeated character is : "+key);
				break;
			}
		}
	}

}
