/**
 * Name:Locharla Tanuja
 * Description:Lab2:To convert array list to array
 * Date:17/03/2021
 */



package lab2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>(); //for creating array list
		al.add("red");              //adding arrays
		al.add("green");
		al.add("orange");
		System.out.println("Converting arraylist to arry:");
		String[] item = al.toArray(new String[al.size()]);
		for(String s: item) {               //for converting array list  to array
			System.out.println(s);
		}
		List<String>i2=new ArrayList<>();
		i2=Arrays.asList(item);
		System.out.println(i2);
		
		// TODO Auto-generated method stub

	}

}
