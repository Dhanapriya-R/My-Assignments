package day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main (String [] args)
	{
		// Here is the input
	int[] arr = {1,2,3,4,7,6,8};

	// Sort the array
	Arrays.sort(arr);
	for (int i = 0; i < arr.length; i++)   
	{
		int j=arr[i];
	}
	{
	int count=1;
	// loop through the array (start i from arr[0] till the length of the array)
	for (int j=0;j<=arr.length-1; j++)
	{
		// check if the iterator variable is not equal to the array values respectively
		if (arr[j]!=j+count)
		{
			// print the number
			System.out.println(j+count);
	}	
					// once printed break the iteration
		count++;
	}
}
}
}
