/**
 * Name:Locharla Tanuja
 * Description:Lab3:To find whether the given string is positive string or not
 * Date:18/03/2021
 */



package lab3;
import java.util.Scanner;
		public class PositiveString {

			public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in); //Forgiving user input
			
			System.out.println("Enter the String");
			String string=sc.next();	
	        System.out.println(checkIfPositive(string));//returns values from below method
		}
		private static String checkIfPositive(String pString) //method to check whether the string is positive string or not
		{
			int count=0;
			String output="";
			for(int i=0;i<pString.length()-1;i++)
			{
				if(pString.charAt(i)>pString.charAt(i+1))
				{
					count++;
	                break;
				}		
			}
			if(count==0)
				output+="positive";
			else
				output+="not positive";
			return output;
		// TODO Auto-generated method stub

	}

}
