package udemy;

public class FindLargestSmallestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr= {3, 5, -33, 11 };
		
		int largest=arr[0];
		int smallest=arr[0];
		
		
		for(int i=1; i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}else if (arr[i]<smallest){
				smallest=arr[i];
				
			}
		}
		System.out.println(largest);
		System.out.println(smallest);
	}

}
