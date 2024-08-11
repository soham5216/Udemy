package udemy;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountWordsGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="my name name is is khan khan";
		HashMap<String, Integer> map=new LinkedHashMap<String, Integer>();
		Integer count=1;
		String[] arr=str.split(" ");
		
		
		
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
			map.put(arr[i], count);
			}
			else {
				map.put(arr[i], map.get(arr[i])+1);
			}
			
		}
		
		for(String x:map.keySet()){
			System.out.println("The count of word:"+x+" = "+map.get(x));
		}
	}

}
