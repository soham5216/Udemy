package udemy;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=876321999;
		
		int result=0;
		
		while(num>0) {
		result=result*10+num%10;
		num=num/10;
		
		}
		System.out.println(result);
	}

}
