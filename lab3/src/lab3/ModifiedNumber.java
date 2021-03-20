/**
 * Name:Locharla Tanuja
 * Description:Lab3:Create a method that accepts a number and modifies the number such as digits difference of 2
 * Date:18/03/2021
 */
package lab3;
import java.lang.Math;

import java.util.Scanner;

public class ModifiedNumber {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //for giving user input
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println("the modified number is "+modifyNumber(num)); //returns the modified number to main method
	}
	private static int modifyNumber(int pNum) //method to modify number
	{
		String str=Integer.toString(pNum);
		int output=0;
		for(int i=0;i<str.length()-1;i++)
		{
			int diff=str.charAt(i)-str.charAt(i+1);
			output=output*10+Math.abs(diff);
		}
		output=output*10+(str.charAt(str.length()-1))-48;
		return output;
	}
}
		
		

	





