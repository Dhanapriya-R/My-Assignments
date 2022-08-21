package week3.day1;

public class MyVehicle {
public static void main (String[] args)
{

	Audi obj1 = new Audi();
	obj1.CloseDoor();
	obj1.PutSeatBelt();
	
	BMW obj2 = new BMW();
	obj2.PutAc();
	obj2.PutSeatBelt();
	
	
	Bajaj obj3 = new Bajaj();
	obj3.WipperOn();
	obj3.EnableMeterBox();
	
	Car obj4 = new Car();
	obj4.PutSeatBelt();
	
	Auto obj5 = new Auto();
	obj5.EnableMeterBox();
	
}
}
