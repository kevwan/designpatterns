package samples.creational.factorymethod;

import samples.commons.Car;

public class FitFactory implements CarFactory
{
	public Car makeCar()
	{
		return new Fit();
	}
}
