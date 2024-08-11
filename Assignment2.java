package udemy;

import java.util.Scanner;
//Write a java program to find substrings of a string: 
//This program find all substrings of a string and then prints them. 
//For example, substrings of "fun" are: "f", "fu", "fun", "u", "un" and "n". 
//The substring method of String class is used to find a substring. For a string of length n, 
//there are (n(n+1))/2 non empty substrings and an empty string. Empty or NULL string is considered 
//to be a substring of every string.
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string="fun";
		String sub;
		//String string, sub;
		int i, c, length;
		/*
		 * Scanner in = new Scanner(System.in);
		 * System.out.println("Enter a string to print it's all substrings");
		 * string = in.nextLine();
		 */
		length = string.length();
		System.out.println("Substrings of "+string+" are:");
		for (c = 0; c < length; c++)
		{
		for(i = 1; i <= length - c; i++)
		{
		sub = string.substring(c, c+i);
		System.out.println(sub);
		}
	}
	}
}
