/**
 * Name:Locharla Tanuja
 * Description:Lab1:To check whether the number is power of 2 or not
 * Date:17/03/2021
 */
package lab1;
import java.util.Scanner;

public class Powerof2ornot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //for taking the user input
		System.out.println("Enter the number");
		int number=sc.nextInt();
   System.out.println(checkNumber(number));
}
public static  boolean checkNumber(int n)//check number method for returning the status to the main method
{
	boolean status=false;
	int i=1,mul=1;
	while(i>0)
	{
		mul*=2;
		if(mul==n)
		{
			status=true;
			break;
		}
		else if(mul>n)
			break;
		i++;
	}
    
	return status;
		
		// TODO Auto-generated method stub

	}

}
