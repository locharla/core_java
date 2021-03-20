/**
 * Name:Locharla Tanuja
 * Description:Lab2:Accept array of an string objects and sort in alphabetical orer
 * Date:17/03/2021
 */



package lab2;
import java.util.Scanner;

public class SortingList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  //for giving user input
		System.out.println("enter the number of items:");
		final int NUM_ITEMS = sc.nextInt();
		System.out.println("enter the values of an array:");
		int[] arr= new int[NUM_ITEMS];
		for(int i=0;i<arr.length;i++) {      //for sorting an array
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					 int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					}
			}
			System.out.println("sorted list is:");
			for(i=0;i<arr.length;i++)
			System.out.println( + arr[i]);
		}
		
		
		// TODO Auto-generated method stub

	}

}
