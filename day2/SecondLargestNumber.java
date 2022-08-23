package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargestNumber {
	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set <Integer> set = new TreeSet <Integer> ();
		List <Integer> list = new ArrayList <Integer> (set);
				
		Collections.sort(list);
		{
				int a= data.length -2;
			
			System.out.println(a);	
				
		}
	}
}
