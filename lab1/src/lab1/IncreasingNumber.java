/**
 * Name:Locharla Tanuja
 * Description:Lab1:check whether the number is in increasing order or not
 * Date:17/03/2021
 */


package lab1;
import java.util.Scanner;

public class IncreasingNumber {

	public static void main(String[] args) {
		//for taking user inputs
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		if(checkNumber(number)==true)  //to check whether the number is in increasing order or not
			System.out.println("Increasing Number");
		else
			System.out.println("Not an increasing Number");
		}
		public static boolean checkNumber(int number) //check number method to return the status to main method
		{
			String str=Integer.toString(number);
			int count=0;
			boolean status=false;
			for(int i=0;i<str.length()-1;i++)
			{
				if(str.charAt(i)<=str.charAt(i+1))
				{
					count++;
				}
			}
			if(count==str.length()-1)
			{
				status=true;
			}
			else
			{
				status=false;
			}
			return status;	
		// TODO Auto-generated method stub

	}

}
