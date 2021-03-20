/**
 * Name:Locharla Tanuja
 * Description:Lab3:To find sum of integers using string tokenizer
 * Date:14/03/2021
 * */
package lab3;
import java.util.Scanner;
import java.util.StringTokenizer;
public class SumOfIntegers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);   //For giving user input 
		System.out.println("Enter the string:");
		String str=sc.next();
		StringTokenizer st=new StringTokenizer(str,",");
		int sum=0;
		while(st.hasMoreTokens())
		{
			sum+=Integer.parseInt(st.nextToken());
		}
		System.out.println("The sum of integer is:"+sum);
		// TODO Auto-generated method stub
		
	}
	
}





	
