package day2;

public class MyCalculator {
	public static void main (String[] args) 
	{
		
		Calculator Result = new Calculator();
		//call all the methods from previous class Calculator
		System.out.println (Result.add(2, 3, 4));
		System.out.println (Result.sub(5, 3));
		System.out.println (Result.mul(2, 3));
		System.out.println (Result.div(9, 3));
	}

}
