/**
 * Name:Locharla Tanuja
 * Description:Lab1:To check whether the number is power of 2 or not
 * Date:17/03/2021
 */
package lab3;
import java.util.Scanner;

				public class MirrorString {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //for giving user input
		System.out.println("Enter the String");
		String string=sc.next();
		System.out.println(getImage(string));  // Returns reversed string from main method
	}
	private static String getImage(String mStr) //getImage method to reverse the string and gives string to main method
	{
		
		StringBuffer reverseStr=new  StringBuffer(mStr);
		reverseStr.reverse();
		return mStr+"|"+reverseStr;
		
	}
	
	// TODO Auto-generated method stub
	
}





