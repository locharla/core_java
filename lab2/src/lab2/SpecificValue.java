/**
 * Name:Locharla Tanuja
 * Description:Lab2:To check whether the specific value is in array or not
 * Date:17/03/2021
 */



package lab2;

import java.util.Scanner;

public class SpecificValue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);             //for giving user input
		System.out.println("enter the number of items:");
		final int NUM_ITEMS = sc.nextInt();
		System.out.println("enter the values of an array:");
		int[] arr= new int[NUM_ITEMS];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the values u want:");
		int j=sc.nextInt();
	int i ,count=0;
		for( i=0;i<arr.length;i++) {                       //checking   whether the specific number is array or not
			
				if(arr[i]==j) {
					count++;
					break;
				}
			}
		
			if(count==1) {
				System.out.println("Number found:" +j );
			
		}
else {
	System.out.println("Number not found");
}
			}	
		
		
	}





