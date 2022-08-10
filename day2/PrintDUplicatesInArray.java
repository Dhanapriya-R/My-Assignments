package day2;

public class PrintDUplicatesInArray {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		// get the length of the array
		int length = arr.length;
		{		
		// iterate from 0 to the array length-1 (outer loop starts here)
		for (int i=1; i<arr.length; i++)
		{
			for (int j=i+1;j<arr.length-1; j++)
			{
				if (arr[i]== arr[j])
				{
					System.out.println (arr[i]);
				}
			}
}
}
}