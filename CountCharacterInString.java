package udemy;

public class CountCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String str="Java is object oriented language";
		
		int count=str.length()-str.replaceAll("a", "").length();
		
		System.out.println(count);
		
	}

}
