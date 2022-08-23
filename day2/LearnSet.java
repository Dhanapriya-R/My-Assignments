package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LearnSet {
public static void main (String[] args)
{
	List <Integer> list = new ArrayList <Integer>();
	list.add(1);
	list.add(22);
	list.add(3);
	list.add(54);
	list.add(65);
	list.add(22);
	list.add(43);
	list.add(67);
	list.add(98);
	list.add(1);
	
	int[] num = {1,22,3,54,65,22,43,67,98,1};
	
Set<Integer> set = new HashSet <Integer> (list);
Set<Integer> duplicate = new HashSet <Integer> ();
System.out.println(set);
for (int i=0; i <list.size(); i++)
{
	if (!duplicate.add(num[i]))
	{
		System.out.println(num[i]);
	
	}
}

}
}