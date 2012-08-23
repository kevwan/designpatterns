package samples.creational.factorymethod;

import samples.commons.Car;

public class CrvFactory implements CarFactory
{
	public Car makeCar()
	{
		return new Crv();
	}
}
