package udemy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="my name is khan khan";
		String[] arr=str.split(" ");
		String sentenceFinal="";
		
		//Set<String> name=new HashSet<String>();
		Set<String> name=new LinkedHashSet<String>();
		for(String st:arr) {
			name.add(st);
		}
		//System.out.println(name);
		for(String word:name) {
			//System.out.println(word+" ");
			sentenceFinal=sentenceFinal+word+" ";
		}
		System.out.println(sentenceFinal);
		/*
		 * Iterator it=name.iterator(); while(it.hasNext()) {
		 * System.out.print(it.next()+" "); }
		 */
	}

}
