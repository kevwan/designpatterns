package samples.creational.builder;

import samples.commons.Door;

public class BasicDoor implements Door
{
	public void close()
	{
		System.out.println("Basic door closed");
	}
}
