package week3.day1;

public class Land implements Plan{

	public void BuildBedRoom(int numbers) {
		System.out.println("Bedroom built successful");
		
	}

	public void BuildBalcony() {
		System.out.println("Balcony built successful");
		
	}

	public void BuildParking() {
		System.out.println("Parking built successful");
		
	}
	public void BuildGarden() {
		System.out.println("Garden built successful");
		
	}
	
	public static void main (String[] args)
	{
		Plan landobj = new Land();
		landobj.BuildBalcony();
		landobj.BuildBedRoom(3);
		landobj.BuildParking();
	}
	
}
