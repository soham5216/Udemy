package udemy;

public class PalindromeCheckerUsingRecursionmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//using recursion method
		//logic for solving-- It will take first and last character and compare. If they are same move to next one. 
		//They it will take second character and 2nd last and compare and so on
		String str="nitin";
		boolean result=isPalindrome(str);
		System.out.println(str+" IsPalindrome ="+result);
	}

	public static boolean isPalindrome(String str) {
		
		if(str==null) {
			return false;
		}
		
		if(str.length()<=1) {//empty string is always a palindrome and 1 charater too
			return true;
		}
		String first=str.substring(0, 1);
		String last=str.substring(str.length()-1, str.length());
		
		if (!first.equals(last))
		{
			return false;
		}else {
			return isPalindrome(str.substring(1, str.length()-1));
		}
	}
	
}
