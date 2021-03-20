/**
 * Name:Locharla Tanuja
 * Description:Lab1:cubesum of digits of a given number
 * Date:14/03/2021
 */
package lab1;

import java.util.Scanner;

public class CubeSum {
	Scanner sc=new Scanner(System.in);//for taking user input
	public static int cubes(int num) { //cube method which returns the value
		int sum=0,n=0; 
		while(num!=0)  {      //For finding cube sum
			n=num%10;
			sum=sum+(n*n*n);
			num/=10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int k=sc.nextInt();
		int result=cubes(k);
		System.out.println("cubesum is:" + result);
	}
}







