package org.system;

public class Desktop extends Computer  {

// Call Method   :desktopSize()
	public void desktopSize()
	{
		System.out.println("Desktop size is 6 inches");
	}
// Call main Method
	public static void main (String[] args)
	{
//Create object for the class desktop
		Desktop obj2 = new Desktop();
		
//call all your class methods into the Desktop using single inheritance.
		obj2.computerModel();
		obj2.desktopSize();
}
}
