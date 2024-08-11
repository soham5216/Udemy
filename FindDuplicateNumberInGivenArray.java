package udemy;

import java.util.Arrays;
import java.util.HashSet;

public class FindDuplicateNumberInGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {9,10,11,12,12,234, 24,22,11,9};
		FindDuplicateNumberInGivenArray.findduplicatenumberinarray(arr);
		FindDuplicateNumberInGivenArray.findDuplicatenumberUsingHashset(arr);
	}
	
	//using arraysort
	public static void findduplicatenumberinarray(int[] arr) {
		
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]==arr[i+1]) {
				System.out.println("duplicate number="+arr[i]);
			}
		}
	}
	
	//Using Hashset
	public static void findDuplicatenumberUsingHashset(int[] arr) {
		
	HashSet<Integer> hash=new HashSet<Integer>();
			
			for(Integer value:arr) {
				
				if(!hash.add(value)) {
					System.out.println("Duplicate number is:"+value);
				}
			}
	}

}
