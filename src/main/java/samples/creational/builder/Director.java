package samples.creational.builder;

import samples.commons.Car;

public class Director
{
	private CarBuilder carBuilder;

	public void constructCar()
	{
		carBuilder.createNewCar();
		carBuilder.buildChassis();
		carBuilder.buildDoor();
	}

	public Car getCar()
	{
		return carBuilder.getCar();
	}

	public void setCarBuilder(CarBuilder builder)
	{
		this.carBuilder = builder;
	}
}
