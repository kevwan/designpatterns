package samples.creational.abstractfactory;

import samples.commons.Door;

public class CrvDoor implements Door
{
	public void close()
	{
		System.out.println("CRV door closed");
	}

	public void open()
	{
		 System.out.println("CRV door opened");
	}
}
