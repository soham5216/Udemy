package udemy;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result="";
		String str="my name is khan";
		String[] arr=str.split(" ");
		
		for (int i=arr.length-1;i>=0;i--) {
			result= result+arr[i]+" ";
		}
		System.out.print(result);
	}

}
