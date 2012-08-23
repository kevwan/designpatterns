package samples.creational.builder;

import samples.commons.Car;

public abstract class CarBuilder
{
	protected Car car;

	public abstract void buildChassis();

	public abstract void buildDoor();

	public void createNewCar()
	{
		car = new Car();
	}

	public Car getCar()
	{
		return car;
	}
}
