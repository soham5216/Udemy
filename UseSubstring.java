package udemy;

public class UseSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="www.erostrum.com";
		
		//www.-- first four
		//.com-- last four
		//erostrum
		
				
				String firstFour=str.substring(0, 4); // here end index 4 is exclusive that means it won't give data for last index 4. It will give data till previous index 3 only
				System.out.println(firstFour);
				
				
				String lastFour=str.substring(str.length()-4, str.length());
				System.out.println(lastFour);
				
				
				String website=str.substring(4, str.length()-4);
				System.out.println(website);
				
				
				

	}

}
