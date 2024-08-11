package udemy;

public class PalindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Katak";
		System.out.println("Original String= "+str);
		
		StringBuilder sb=new StringBuilder(str);
		String result=sb.reverse().toString().toLowerCase();
		System.out.println("Reversed String= "+result);
		if(result.equals(str.toLowerCase())) {
			System.out.println("This is Palindrome");
		}else {
			
			System.out.println("This is NOT Palindrome");
		}
		
		

	}

}
