package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class CheckDuplicateNumber {
public static void main (String[] args)
{
	List <Integer> number = new ArrayList <Integer>();
	 number.add(1);
	 number.add(22);
	 number.add(3);
	 number.add(54);
	 number.add(65);
	 number.add(22);
	 number.add(43);
	 
	 int a=0;
	 for (int Num : number)
	 if (Num==22)
	 {
		 a++;
	 }
	 
	System.out.println ("No of duplicates:" +a ) ;
}
}
