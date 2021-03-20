
/**
 * Name:Locharla Tanuja
 * Description:Lab1:To calculate sum of n natural numbers which are divisible by 3 and 5
 * Date:17/03/2021
 */package lab1;
import java.util.Scanner;

public class SumOfNNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //for giving using inputs
		System.out.println("enter the number of numbers:");
		int num=sc.nextInt();
		int sum=0;
		for(int i=0;i<=num;i++) { 
			if(i%3==0||i%5==0) { // checking whether the number is divisible by 3 and 5
				sum=sum+i;       //adding numbers which are divisible by 3 and 5
			}
			
		}
		System.out.println("sum of natural numbers divisible by 3 and 5 is:" +sum);
	}

}

