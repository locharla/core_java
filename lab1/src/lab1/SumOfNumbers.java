/**
 * Name:Locharla Tanuja
 * Description:Lab1:Difference between sum of squares and square sum of the first n natural numbers
 * Date:14/03/2021
 */



package lab1;

import java.util.Scanner;



public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //for giving user inputs
		System.out.println("enter the number of numbers:");
		int num=sc.nextInt();
		System.out.println("the difference is"+calculatedifference(num));//calling value form below method
	}
	private static int calculatedifference(int n) { 
		//calculate difference method which returns difference value to main method
		
		int sum1=0,sum2=0,diff;
		for(int i=0;i<=n;i++) {
		 
			sum1+=i;
			sum2+=(i*i);
		}
		diff=(sum1*sum1)-(sum2);
	return diff;
				}
}