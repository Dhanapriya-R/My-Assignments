package day2;

public class PrimeNumber {
public static boolean prime (int a)
{
	if (a<=0)
		return false;
	//prime number is a number which is divisible by itself and '1'
	//If divisor of a number by '2' is '0' then it is not a prime number.
	if (a%2==0)
		return false;
	else 
		return true;
	
}
public static void main (String[] args)
{
	if (prime (13))
		System.out.println ("True");
	else 
		System.out.println ("false");
}
}
