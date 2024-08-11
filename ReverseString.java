package udemy;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//one
		String str="gninihs si nuS";
		
		StringBuffer bs= new StringBuffer(str);
		String res=bs.reverse().toString();
		System.out.println(res);
//two		
		String reverse="";
		char[] ch=str.toCharArray();
		for(int i=ch.length-1; i>=0;i-- ) {
			reverse=reverse+ch[i];
			//System.out.print(ch[i]);
		}
		System.out.println(reverse);
		
		
//three		
		
		  String result=""; 
		  for(int i=str.length()-1; i>=0;i-- ) {
		  result=result+str.charAt(i);
		  
		  } System.out.println(result);
		 
	}

}
