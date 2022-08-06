package week1.day1;

public class TwoWheeler {
	int noofwheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 6789990057L;
	boolean ispuncnctured = false; 
	String bikename = "Dio";
	double runningKM =60.78D;
	public static void main(String[] args)
	{
		TwoWheeler TW = new TwoWheeler();
		System.out.println(TW.noofwheels);
		System.out.println(TW.noOfMirrors);
		System.out.println(TW.chassisNumber);
		System.out.println(TW.ispuncnctured);
		System.out.println(TW.bikename);
		System.out.println(TW.runningKM);
		
	}
}
