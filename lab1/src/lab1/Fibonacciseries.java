/**
*Name:Locharla Tanuja
*Description:Lab1: to generate Fibinoacci series upto given limit
*Date:14/03/2021
*/

package lab1;
import java.util.*;
public class Fibonacciseries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //for taking user input
		int count=sc.nextInt();
		int n1=0,n2=1,n3,i;
		System.out.println(n1+"\n"+n2);
		for(i=2;i<count;i++) { //For finding fibonacci series
			n3=n1+n2;
			System.out.println(""+n3);
			n1=n2;
			n2=n3;
		}
		// TODO Auto-generated method stub

	}

}
