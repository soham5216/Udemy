package udemy;

public class ReverseEachWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="my name is khan";
		String[] arr=str.split(" ");
		String result="";
		String reverseword="";
		
		for (String word:arr) {
			
			
			  //Type 1 
			StringBuilder sb=new StringBuilder(word);
			result=sb.reverse().toString(); 
			//System.out.println(result+" ");
			reverseword=reverseword+result+" ";
			  
			/*//Type 2
			String reverse="";
			char[] ch=word.toCharArray();
			for(int i=ch.length-1; i>=0;i-- ) {
				reverse=reverse+ch[i];
				
			}
			System.out.print(reverse+" ");*/
			
		}
		System.out.println(reverseword);
		
	}

}
