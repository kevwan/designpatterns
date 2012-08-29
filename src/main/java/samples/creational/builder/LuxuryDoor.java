package samples.creational.builder;

import samples.commons.Door;

public class LuxuryDoor implements Door
{
	public void close()
	{
		System.out.println("Luxury door closed");
	}

	public void open()
	{
		System.out.println("Luxury door opened");
	}
}
