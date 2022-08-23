package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

//Create a main class
public static void main (String[] args)
{

//Declare list1 method 
List <Integer> list1 = new ArrayList <Integer> ();

//Add input variable for list1
list1.add(3);
list1.add(2);
list1.add(11);
list1.add(4);
list1.add(6);
list1.add(7);

//Declare list2 method
List <Integer> list2 = new ArrayList <Integer> ();

//Add input variable for list2
list2.add(1);
list2.add(2);
list2.add(8);
list2.add(4);
list2.add(9);
list2.add(7);

//iterate inner loop for list1
for (int i=0; i<list1.size(); i++)
{
	
//iterate inner loop for list1
	for (int j=0; j<list2.size(); j++)
	{
		
//Condition to check data in list1 equals to element in list2
		if(list1.get(i)==list2.get(j))
			
//System output print when data is equal
				System.out.println(list1.get(i));
	}
}
	
}
}