/**
 * Name:Locharla Tanuja
 * Description: Lab1:To display prime numbers upto specific number
 * Date:14/03/2021
 **/
 
package lab1;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in); //for taking user input
		System.out.println("enter a number:");
		int num=sc.nextInt();
		int i=0,n=0;
		String primenumbers="";
		for(i=1; i<=num;i++) { //for checking whether the numbers are prime or not
			int counter=0;
			for(n=i;n>=1;n--) {
				if(i%n==0)
				{
					counter=counter+1;
				}
			}
			if(counter==2) {
				primenumbers=primenumbers+i+" ";
			}
		}
		System.out.println("Primenumbers are:" + primenumbers);
	}

}

