/**
 * Name:Locharla Tanuja
 * Description:Lab1:To simulate traffic light
 * Date:14/03/2021
 */


package lab1;
import java.util.*;

public class TrafficLight {
	
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in); //for giving user input
		System.out.println("enter a number from 1 to 3 to display signal:");
		System.out.println("1.red"+"\n"+"2.green"+"\n"+"3.yellow");
		int signal=sc.nextInt();
		if(signal==1) {                         //loop to display the signal
			System.out.println("stop");
		}
		else if(signal==2) {
			System.out.println("go");
		}
		else if(signal==3) {
			System.out.println("ready");
		}
		else
			System.out.println("please enter valid input");
	}
}
			




