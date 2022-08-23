package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
	public static void main (String[] args)
	{
		int [] a= {1,2,3,5,6,7,8,9,10};
		
		Set <Integer> set = new HashSet <Integer> ();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(9);
		set.add(10);
		
		int n = set.size() + 1;
		int Sum = (n*(n+1))/2;
		int result =0;
		
			for (int i=0; i<set.size(); i++)
			{
		
				result=result+a[i];
				
			}
			int missed=Sum - result;
			System.out.println(missed);
}
}
