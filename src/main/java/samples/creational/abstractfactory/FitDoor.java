package samples.creational.abstractfactory;

import samples.commons.Door;

public class FitDoor implements Door
{
	public void close()
	{
		System.out.println("Fit door closed");
	}

	public void open()
	{
		System.out.println("Fit door opened");
	}
}
