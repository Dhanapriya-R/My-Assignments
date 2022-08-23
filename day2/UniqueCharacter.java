package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacter {
	
		public static int FindUniqueCharactercount(String str)
		{
			
	
		Set <Character> set = new HashSet <Character> ();
		
		for (int i=0; i<str.length(); i++)
	
			set.add(str.charAt(i));
            
			return set.size(); 
		}
			public static void main (String[] args)
			{
	String str = "DHANAPRIYA";		
			System.out.println (UniqueCharacter.FindUniqueCharactercount(str));
		
	}
}
	

