package udemy;

public class FibanacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int first=0;
		int second=1;
		int third;
		
		for (int i=1; i<=10;i++) {
			System.out.print(first+" ");
			third=first+second;
			first=second;
			second=third;
			
		}
		
		
	}

}
