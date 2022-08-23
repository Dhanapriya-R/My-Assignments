package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
public static void main (String[] args)
{
	List <String> list = new ArrayList <String>();
	list.add("Karthi");
	list.add("Arun");
	list.add("Dev");
	list.add("Selva");
	list.add("Anbu");
	list.add("Sekar");
	
	Collections.sort(list);
	System.out.println (list);
	
	for (String S : list)
	{
	if (S.startsWith("S"))
	{
		System.out.println (S);
		
	}
}
}
}


