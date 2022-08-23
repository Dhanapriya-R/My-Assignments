package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main (String[] args)
    {   
    //Create string variable with default value  
    String str = "PAYPAL INDIA";   
{     
//Create HashSet of type character   
Set<Character> set = new LinkedHashSet<Character>();   
//Add each character of the string into HashSet   
for(int i=0;i<str.length();i++)   
   set.add(str.charAt(i));   

    
// print the string after removing duplicate characters   
for(Character ch : set)   
    System.out.print(ch);   
}   

}   
}

