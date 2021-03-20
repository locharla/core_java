/**
 * Name:Locharla Tanuja
 * Description:Lab2:To check the second smallest number in a given array
 * Date:17/03/2021
 */


package lab2;
import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //for taking user input
		System.out.println("Enter the number of items");
		final int NUM_ITEMS=sc.nextInt();
		int [] items=new int[NUM_ITEMS];
		
		System.out.println("Enter the elements of an array");
		for(int i=0;i<items.length;i++)
			items[i]=sc.nextInt();
		Arrays.sort(items);
		System.out.println("Second smallest number in an array: "+getSecondSmallest(items));  //to call value from below method
		
		
	}
	public static int getSecondSmallest(int arr[])  //get second smallest method which returns value to the main ethod
	{
		int secondSmallest=0,firstSmallest=arr[0];
		for(int i=1;i<arr.length;i++)   //to find second smallest method
		{
			if(arr[i]!=firstSmallest)
			{
				secondSmallest=arr[i];
				break;
			}
		}
		return secondSmallest;
		// TODO Auto-generated method stub

	}

}
