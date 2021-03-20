/**
 * Name:Locharla Tanuja
 * Description:lab3:To find the length and number of characters in a given string
 * Date:18/03/2021
 */



package lab3;

import java.util.Scanner;

public class NumberOfCharactersAndLength {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);    //for user input
		
		System.out.println("Enter the string");
		String string=sc.nextLine();
		int lineLength=string.split("\\.").length;
		int wordLength=string.split(" ").length+lineLength-1;
		int characterCount=0;
		for(int i=0;i<string.length();i++)       //to know length and number of characters in a string
		{
			if(string.charAt(i)!=' '&&string.charAt(i)!='.')
				characterCount++;
				
		}
		System.out.println(lineLength);
		System.out.println(wordLength);
		System.out.println(characterCount);
	

	}

}
