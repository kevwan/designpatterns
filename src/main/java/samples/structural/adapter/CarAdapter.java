package samples.structural.adapter;

import samples.commons.Car;

public class CarAdapter implements Vehicle
{
	private final Car car;

	public CarAdapter(Car car)
	{
		this.car = car;
	}

	public void go()
	{
		car.drive();
	}
}
